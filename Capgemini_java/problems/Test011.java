package problems;

import java.util.ArrayList;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

abstract class Account {
    private int accountNumber;
    private String holderName;
    private double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance = balance + amount;
        System.out.println("Amount deposited successfully");
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance = balance - amount;
        System.out.println("Amount withdrawn successfully");
    }

    public abstract void calculateInterest();

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Holder Name: " + holderName + ", Balance: " + balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.04;
        System.out.println("Savings Interest: " + interest);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.02;
        System.out.println("Current Interest: " + interest);
    }
}

interface BankService {
    void createAccount();
    void deposit();
    void withdraw();
    void displayAccounts();
    void deleteAccount();
}

public class Test011 implements BankService {
    ArrayList<Account> accounts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Account searchAccount(int accountNumber) {
        for (Account a : accounts) {
            if (a.getAccountNumber() == accountNumber) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void createAccount() {
        System.out.print("Enter Account Number: ");
        String accountInput = sc.nextLine();
        int accountNumber;
        try {
            accountNumber = Integer.parseInt(accountInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: Account Number must contain numbers only");
            return;
        }

        System.out.print("Enter Holder Name: ");
        String holderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        String balanceInput = sc.nextLine();
        double balance;
        try {
            balance = Double.parseDouble(balanceInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: Balance must be a number");
            return;
        }

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter Account Type: ");
        String choiceInput = sc.nextLine();
        int choice;
        try {
            choice = Integer.parseInt(choiceInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: Choice must be a number");
            return;
        }

        Account account;
        if (choice == 1) {
            account = new SavingsAccount(accountNumber, holderName, balance);
        } else if (choice == 2) {
            account = new CurrentAccount(accountNumber, holderName, balance);
        } else {
            System.out.println("Invalid account type");
            return;
        }

        accounts.add(account);
        System.out.println("Account created successfully");
    }

    @Override
    public void deposit() {
        System.out.print("Enter Account Number: ");
        String accountInput = sc.nextLine();
        int accountNumber;
        try {
            accountNumber = Integer.parseInt(accountInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: Account Number must contain numbers only");
            return;
        }

        Account account = searchAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found");
            return;
        }

        System.out.print("Enter Deposit Amount: ");
        String amountInput = sc.nextLine();
        double amount;
        try {
            amount = Double.parseDouble(amountInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: Amount must be a number");
            return;
        }

        account.deposit(amount);
    }

    @Override
    public void withdraw() {
        System.out.print("Enter Account Number: ");
        String accountInput = sc.nextLine();
        int accountNumber;
        try {
            accountNumber = Integer.parseInt(accountInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: Account Number must contain numbers only");
            return;
        }

        Account account = searchAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found");
            return;
        }

        System.out.print("Enter Withdrawal Amount: ");
        String amountInput = sc.nextLine();
        double amount;
        try {
            amount = Double.parseDouble(amountInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: Amount must be a number");
            return;
        }

        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void displayAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available");
            return;
        }
        for (Account a : accounts) {
            System.out.println(a);
            a.calculateInterest();
            System.out.println("-----------------------");
        }
    }

    @Override
    public void deleteAccount() {
        System.out.print("Enter Account Number: ");
        String accountInput = sc.nextLine();
        int accountNumber;
        try {
            accountNumber = Integer.parseInt(accountInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: Account Number must contain numbers only");
            return;
        }

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                accounts.remove(i);
                System.out.println("Account deleted successfully");
                return;
            }
        }
        System.out.println("Account not found");
    }

    public static void main(String[] args) {
        Test011 app = new Test011();
        while (true) {
            System.out.println("\n===== Bank Management System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Accounts");
            System.out.println("5. Delete Account");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            String choiceInput = app.sc.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException e) {
                System.out.println("Error: Choice must be a number");
                continue;
            }

            switch (choice) {
                case 1:
                    app.createAccount();
                    break;
                case 2:
                    app.deposit();
                    break;
                case 3:
                    app.withdraw();
                    break;
                case 4:
                    app.displayAccounts();
                    break;
                case 5:
                    app.deleteAccount();
                    break;
                case 6:
                    System.out.println("Program terminated");
                    app.sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
