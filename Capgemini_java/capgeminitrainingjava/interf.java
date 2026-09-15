package capgeminitrainingjava;
// interface
class Interf { 
    String name = "Nithin"; 
} 

interface Atm { 
    default void deposit() { 
        System.out.println("Money deposited"); 
    } 
} 

class Bank implements Atm { 
    public void balance() { 
        System.out.println("Money balance"); 
    } 

    public static void main(String[] args) { 
        Bank myBank = new Bank();
        myBank.deposit(); 
        myBank.balance(); 
    } 
}
