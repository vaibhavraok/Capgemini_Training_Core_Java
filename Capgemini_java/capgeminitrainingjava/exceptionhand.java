package capgeminitrainingjava;
import java.util.*;

class InvalidAgeException extends Exception {// Exception is the inbuilt class and now here we are trying to customize the exception (inheritance)
    InvalidAgeException(String message) {
        super(message);
    }
}

class exceptionhand {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("The age is invalid");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}














//import java.util.*;
//
//class InvalidAgeException extends Exception{
//	InvalidAgeException(String message){
//		super(message);
//	}
//}
//class exceptionhand {
//    public static void checkAge(int age) throws InvalidAgeException{
//        if (age < 18) {
//            throw new ArithmeticException("The age is invalid");
//        } else {
//            System.out.println("Eligible to vote");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        
//        try {
//            checkAge(age);
//        } catch (ArithmeticException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//        }
//    }
//














//class exceptionhand {
//    
//    public static void checkAge(int age) {
//        if (age < 18) {
//            throw new ArithmeticException("Under age");
//        } else {
//            System.out.println("Eligible to vote");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        
//        try {
//            checkAge(age);
//        } catch (ArithmeticException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//        }
//    }



