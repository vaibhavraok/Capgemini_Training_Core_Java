package projects;

import java.util.Scanner;

abstract class Employee1 {
    private final int employeeId;
    private final String name;
    private double baseSalary;

    public Employee1(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateBonus();
    public abstract double calculateTotalSalary();
}

class Manager1 extends Employee1 {
    public Manager1(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary() * 0.20;
    }

    @Override
    public double calculateTotalSalary() {
        return getBaseSalary() + calculateBonus();
    }
}

class Developer1 extends Employee1 {
    public Developer1(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary() * 0.10;
    }

    @Override
    public double calculateTotalSalary() {
        return getBaseSalary() + calculateBonus();
    }
}

public class EmployeePayrollSystem {
    private static Employee1[] employees = new Employee1[100];
    private static int employeeCount = 0;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== EMPLOYEE PAYROLL SYSTEM ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    displayEmployees();
                    break;
                case 4:
                    updateEmployee();
                    break;
                case 5:
                	return;
//                    System.out.println("Exiting system. Goodbye!");
//                    sc.close();
//                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addEmployee() {
        if (employeeCount >= employees.length) {
            System.out.println("System full. Cannot add more employees.");
            return;
        }

        System.out.print("Enter Role (1 for Manager, 2 for Developer): ");
        int role = sc.nextInt();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Base Salary: ");
        double salary = sc.nextDouble();

        if (role == 1) {
            employees[employeeCount] = new Manager1(id, name, salary);
            employeeCount++;
            System.out.println("Manager added successfully!");
        } else if (role == 2) {
            employees[employeeCount] = new Developer1(id, name, salary);
            employeeCount++;
            System.out.println("Developer added successfully!");
        } else {
            System.out.println("Invalid role choice. Employee not added.");
        }
    }

    private static void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = sc.nextInt();
        
        int index = findEmployeeIndexById(id);
        if (index != -1) {
            for (int i = index; i < employeeCount - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[employeeCount - 1] = null;
            employeeCount--;
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee ID not found.");
        }
    }

    private static void displayEmployees() {
        if (employeeCount == 0) {
            System.out.println("No records found.");
            return;
        }
        for (int i = 0; i < employeeCount; i++) {
            Employee1 emp = employees[i];
            String roleType = emp.getClass().getSimpleName();
            System.out.println("\n--- " + roleType + " Details ---");
            System.out.println("ID: " + emp.getEmployeeId());
            System.out.println("Name: " + emp.getName());
            System.out.printf("Base Salary: $%.2f%n", emp.getBaseSalary());
            System.out.printf("Bonus: $%.2f%n", emp.calculateBonus());
            System.out.printf("Total Salary: $%.2f%n", emp.calculateTotalSalary());
        }
    }

    private static void updateEmployee() {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();

        int index = findEmployeeIndexById(id);
        if (index != -1) {
            System.out.print("Enter New Base Salary: ");
            double newSalary = sc.nextDouble();
            //employees[index].setBaseSalary(newSalary);
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Employee ID not found.");
        }
    }

    private static int findEmployeeIndexById(int id) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmployeeId() == id) {
                return i;
            }
        }
        return -1;
    }
}



























//package problems;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//abstract class Employee {
//    private final int employeeId;
//    private final String name;
//    private double baseSalary;
//
//    public Employee(int employeeId, String name, double baseSalary) {
//        this.employeeId = employeeId;
//        this.name = name;
//        this.baseSalary = baseSalary;
//    }
//
//    public int getEmployeeId() {
//        return employeeId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getBaseSalary() {
//        return baseSalary;
//    }
//
//    public void setBaseSalary(double baseSalary) {
//        this.baseSalary = baseSalary;
//    }
//
//    public abstract double calculateBonus();
//    public abstract double calculateTotalSalary();
//}
//
//class Manager extends Employee {
//    public Manager(int employeeId, String name, double baseSalary) {
//        super(employeeId, name, baseSalary);
//    }
//
//    @Override
//    public double calculateBonus() {
//        return getBaseSalary() * 0.20;
//    }
//
//    @Override
//    public double calculateTotalSalary() {
//        return getBaseSalary() + calculateBonus();
//    }
//}
//
//class Developer extends Employee {
//    public Developer(int employeeId, String name, double baseSalary) {
//        super(employeeId, name, baseSalary);
//    }
//
//    @Override
//    public double calculateBonus() {
//        return getBaseSalary() * 0.10;
//    }
//
//    @Override
//    public double calculateTotalSalary() {
//        return getBaseSalary() + calculateBonus();
//    }
//}
//
//public class EmployeePayrollSystem {
//    private static final ArrayList<Employee> employees = new ArrayList<>();
//    private static final Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        while (true) {
//            System.out.println("\n=== EMPLOYEE PAYROLL SYSTEM ===");
//            System.out.println("1. Add Employee");
//            System.out.println("2. Remove Employee");
//            System.out.println("3. Display All Employees");
//            System.out.println("4. Update Employee Salary");
//            System.out.println("5. Exit");
//            System.out.print("Select an option: ");
//            
//            int choice = sc.nextInt();
//            sc.nextLine(); 
//
//            switch (choice) {
//                case 1:
//                    addEmployee();
//                    break;
//                case 2:
//                    removeEmployee();
//                    break;
//                case 3:
//                    displayEmployees();
//                    break;
//                case 4:
//                    updateEmployee();
//                    break;
//                case 5:
//                    System.out.println("Exiting system. Goodbye!");
//                    sc.close();
//                    return;
//                default:
//                    System.out.println("Invalid option. Please try again.");
//            }
//        }
//    }
//
//    private static void addEmployee() {
//        System.out.print("Enter Role (1 for Manager, 2 for Developer): ");
//        int role = sc.nextInt();
//        System.out.print("Enter Employee ID: ");
//        int id = sc.nextInt();
//        sc.nextLine(); 
//        System.out.print("Enter Name: ");
//        String name = sc.nextLine();
//        System.out.print("Enter Base Salary: ");
//        double salary = sc.nextDouble();
//
//        if (role == 1) {
//            employees.add(new Manager(id, name, salary));
//            System.out.println("Manager added successfully!");
//        } else if (role == 2) {
//            employees.add(new Developer(id, name, salary));
//            System.out.println("Developer added successfully!");
//        } else {
//            System.out.println("Invalid role choice. Employee not added.");
//        }
//    }
//
//    private static void removeEmployee() {
//        System.out.print("Enter Employee ID to remove: ");
//        int id = sc.nextInt();
//        
//        Employee toRemove = findEmployeeById(id);
//        if (toRemove != null) {
//            employees.remove(toRemove);
//            System.out.println("Employee removed successfully.");
//        } else {
//            System.out.println("Employee ID not found.");
//        }
//    }
//
//    private static void displayEmployees() {
//        if (employees.isEmpty()) {
//            System.out.println("No records found.");
//            return;
//        }
//        for (Employee emp : employees) {
//            String roleType = emp.getClass().getSimpleName();
//            System.out.println("\n--- " + roleType + " Details ---");
//            System.out.println("ID: " + emp.getEmployeeId());
//            System.out.println("Name: " + emp.getName());
//            System.out.printf("Base Salary: $%.2f%n", emp.getBaseSalary());
//            System.out.printf("Bonus: $%.2f%n", emp.calculateBonus());
//            System.out.printf("Total Salary: $%.2f%n", emp.calculateTotalSalary());
//        }
//    }
//
//    private static void updateEmployee() {
//        System.out.print("Enter Employee ID to update: ");
//        int id = sc.nextInt();
//
//        Employee emp = findEmployeeById(id);
//        if (emp != null) {
//            System.out.print("Enter New Base Salary: ");
//            double newSalary = sc.nextDouble();
//            emp.setBaseSalary(newSalary);
//            System.out.println("Salary updated successfully.");
//        } else {
//            System.out.println("Employee ID not found.");
//        }
//    }
//
//    private static Employee findEmployeeById(int id) {
//        for (Employee emp : employees) {
//            if (emp.getEmployeeId() == id) {
//                return emp;
//            }
//        }
//        return null;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////abstract class Employee1 {
////    private int employeeId1;
////    private String name1;
////    private double baseSalary1;
////
////    public Employee1(int employeeId1, String name1, double baseSalary1) {
////        this.employeeId1 = employeeId1;
////        this.name1 = name1;
////        this.baseSalary1 = baseSalary1;
////    }
////
////    public int getEmployeeId1() {
////        return employeeId1;
////    }
////
////    public String getName1() {
////        return name1;
////    }
////
////    public double getBaseSalary1() {
////        return baseSalary1;
////    }
////
////    public abstract double calculateBonus1();
////    public abstract double calculateTotalSalary1();
////}
////
////class Manager1 extends Employee1 {
////    public Manager1(int employeeId1, String name1, double baseSalary1) {
////        super(employeeId1, name1, baseSalary1);
////    }
////
////    public double calculateBonus1() {
////        return getBaseSalary1() * 0.20;
////    }
////
////    public double calculateTotalSalary1() {
////        return getBaseSalary1() + calculateBonus1();
////    }
////}
////
////class Developer1 extends Employee1 {
////    public Developer1(int employeeId1, String name1, double baseSalary1) {
////        super(employeeId1, name1, baseSalary1);
////    }
////
////    public double calculateBonus1() {
////        return getBaseSalary1() * 0.10;
////    }
////
////    public double calculateTotalSalary1() {
////        return getBaseSalary1() + calculateBonus1();
////    }
////}
////
////public class EmployeePayrollSystem {
////    public static void main(String[] args1) {
////        Scanner sc = new Scanner(System.in);
////
////        System.out.print("Enter Manager ID: ");
////        int mId1 = sc.nextInt();
////        sc.nextLine();
////        System.out.print("Enter Manager Name: ");
////        String mName1 = sc.nextLine();
////        System.out.print("Enter Manager Base Salary: ");
////        double mSalary1 = sc.nextDouble();
////
////        Employee1 manager1 = new Manager1(mId1, mName1, mSalary1);
////
////        System.out.print("\nEnter Developer ID: ");
////        int dId1 = sc.nextInt();
////        sc.nextLine();
////        System.out.print("Enter Developer Name: ");
////        String dName1 = sc.nextLine();
////        System.out.print("Enter Developer Base Salary: ");
////        double dSalary1 = sc.nextDouble();
////
////        Employee1 developer1 = new Developer1(dId1, dName1, dSalary1);
////
////        System.out.println("\n--- Manager Details ---");
////        System.out.println("ID: " + manager1.getEmployeeId1());
////        System.out.println("Name: " + manager1.getName1());
////        System.out.println("Base Salary: $" + manager1.getBaseSalary1());
////        System.out.println("Bonus: $" + manager1.calculateBonus1());
////        System.out.println("Total Salary: $" + manager1.calculateTotalSalary1());
////        System.out.println();
////
////        System.out.println("--- Developer Details ---");
////        System.out.println("ID: " + developer1.getEmployeeId1());
////        System.out.println("Name: " + developer1.getName1());
////        System.out.println("Base Salary: $" + developer1.getBaseSalary1());
////        System.out.println("Bonus: $" + developer1.calculateBonus1());
////        System.out.println("Total Salary: $" + developer1.calculateTotalSalary1());
////    }
////}
