package projects;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Added custom exception class as per requirement
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

abstract class Student2 {
    private int id;
    private String name;
    private int marks;
    
    // Validate marks during object creation
    Student2(int id, String name, int marks) throws InvalidMarkException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarkException("Marks must be between 0 and 100.");
        }
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    public int getId() {
        return id;
    }
    
    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
    
    public abstract void calculateGrade();
}

class UGStudent extends Student2 {
    UGStudent(int id, String name, int marks) throws InvalidMarkException {
        super(id, name, marks);
    }

    @Override
    public void calculateGrade() {
        System.out.println("UG Grade");
        if(super.getMarks()>=70) {
        	System.out.println("First class");
        }
    }
}

class PGStudent extends Student2 {
    PGStudent(int id, String name, int marks) throws InvalidMarkException {
        super(id, name, marks);
    }

    @Override
    public void calculateGrade() {
        System.out.println("PG Grade");
        if(super.getMarks()>=60) {
        	System.out.println("First class");
        }
    }
}

public class MainApp {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student2> a = new ArrayList<>();

    public static void main(String[] args) {
        MainApp app = new MainApp();
        
        while (true) {
            System.out.println("\n----- Student Details ------");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Search Student");
            System.out.println("4. Sort Students By Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            int choice = app.sc.nextInt();
            switch (choice) {
                case 1:
                    app.addStudent();
                    break;
                case 2:
                    app.displayStudent();
                    break;
                case 3:
                    app.searchStudent();
                    break;
                case 4:
                    app.sortStudentByMarks();
                    break;
                case 5:
                    app.deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting application.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public void addStudent() { 
        System.out.print("\nEnter UG or PG: "); 
        String option = sc.next(); 
        System.out.print("Enter Student Id: "); 
        int id = sc.nextInt(); 
        System.out.print("Enter Student Name: "); 
        String name = sc.next(); 
        System.out.print("Enter Student Marks: "); 
        int marks = sc.nextInt(); 
        
        try {
            if (option.equalsIgnoreCase("UG")) { 
                a.add(new UGStudent(id, name, marks)); 
                System.out.println("UG Student added successfully"); 
            } else if (option.equalsIgnoreCase("PG")) { 
                a.add(new PGStudent(id, name, marks)); 
                System.out.println("PG Student added successfully"); 
            } else {
                System.out.println("Invalid Student Type. Not Added.");
            }
        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }
    } 
    
    public void displayStudent() { 
        if (a.isEmpty()) { 
            System.out.println("No students found."); 
            return; 
        } 
        for (Student2 student : a) { 
            System.out.println(student); 
        } 
    } 
    
    public void searchStudent() { 
        System.out.print("Enter the Student Id to search: "); 
        int rid = sc.nextInt(); 
        boolean found = false; 
        for (Student2 student : a) { 
            if (student.getId() == rid) { 
                System.out.println("Found: " + student); 
                // Fixed: Removed the crashing line a.get(rid)
                found = true; 
                break; 
            } 
        } 
        if (!found) { 
            System.out.println("Student with ID " + rid + " not found."); 
        } 
    } 
    
    public void sortStudentByMarks() { 
        System.out.println("\nSorting Students By Marks (Highest First)..."); 
        Collections.sort(a, new MarksComparator()); 
        displayStudent(); 
    } 
    
    public void deleteStudent() { 
        System.out.print("\nEnter Student ID to delete: "); 
        int rid = sc.nextInt(); 
        boolean found = false;
        for (int i = a.size() - 1; i >= 0; i--) { 
            if (a.get(i).getId() == rid) { 
                a.remove(i); 
                System.out.println("Student with ID " + rid + " deleted successfully."); 
                found = true;
                break;
            } 
        } 
        if (!found) {
            System.out.println("Student ID not found."); 
        }
    } 
    
    class MarksComparator implements Comparator<Student2> { 
        @Override 
        public int compare(Student2 s1, Student2 s2) { 
            return Integer.compare(s2.getMarks(), s1.getMarks()); 
        } 
    } 
}

















//package problems;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//abstract class Student2 {
//    private int id;
//    private String name;
//    private int marks;
//    
//    Student2(int id, String name, int marks) {
//        this.id = id;
//        this.name = name;
//        this.marks = marks;
//    }
//    
//    public int getId() {
//        return id;
//    }
//    
//    public int getMarks() {
//        return marks;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
//    }
//    
//    public abstract void calculateGrade();
//}
//
//class UGStudent extends Student2 {
//    UGStudent(int id, String name, int marks) {
//        super(id, name, marks);
//    }
//
//    @Override
//    public void calculateGrade() {
//        System.out.println("UG Grade");
//        if(super.getMarks()>=70) {
//        	System.out.println("First class");
//        }
//    }
//}
//
//class PGStudent extends Student2 {
//    PGStudent(int id, String name, int marks) {
//        super(id, name, marks);
//    }
//
//    @Override
//    public void calculateGrade() {
//        System.out.println("PG Grade");
//        if(super.getMarks()>=60) {
//        	System.out.println("First class");
//        }
//    }
//}
//
//public class MainApp {
//    Scanner sc = new Scanner(System.in);
//    ArrayList<Student2> a = new ArrayList<>();
//
//    public static void main(String[] args) {
//        MainApp app = new MainApp();
//        
//        while (true) {
//            System.out.println("\n----- Student Details ------");
//            System.out.println("1. Add Student");
//            System.out.println("2. Display Student");
//            System.out.println("3. Search Student");
//            System.out.println("4. Sort Students By Marks");
//            System.out.println("5. Delete Student");
//            System.out.println("6. Exit");
//            System.out.print("Select an option: ");
//            int choice = app.sc.nextInt();
//            switch (choice) {
//                case 1:
//                    app.addStudent();
//                    break;
//                case 2:
//                    app.displayStudent();
//                    break;
//                case 3:
//                    app.searchStudent();
//                    break;
//                case 4:
//                    app.sortStudentByMarks();
//                    break;
//                case 5:
//                    app.deleteStudent();
//                    break;
//                case 6:
//                    System.out.println("Exiting application.");
//                    return;
//                default:
//                    System.out.println("Invalid option. Please try again.");
//            }
//        }
//    }
//
//            
//    
//    public void addStudent() { 
//        System.out.print("\nEnter UG or PG: "); 
//        String option = sc.next(); 
//        System.out.print("Enter Student Id: "); 
//        int id = sc.nextInt(); 
//        System.out.print("Enter Student Name: "); 
//        String name = sc.next(); 
//        System.out.print("Enter Student Marks: "); 
//        int marks = sc.nextInt(); 
//        if (option.equalsIgnoreCase("UG")) { 
//            a.add(new UGStudent(id, name, marks)); 
//            System.out.println("UG Student added successfully"); 
//        } else if (option.equalsIgnoreCase("PG")) { 
//            a.add(new PGStudent(id, name, marks)); 
//            System.out.println("PG Student added successfully"); 
//        } 
//    } 
//    
//    public void displayStudent() { 
//        if (a.isEmpty()) { 
//            System.out.println("No students found."); 
//            return; 
//        } 
//        for (Student2 student : a) { 
//            System.out.println(student); 
//        } 
//    } 
//    
//    public void searchStudent() { 
//        System.out.print("Enter the Student Id to search: "); 
//        int rid = sc.nextInt(); 
//        boolean found = false; 
//        for (Student2 student : a) { 
//            if (student.getId() == rid) { 
//                System.out.println("Found: " + student); 
//               System.out.println(a.get(rid)); 
//                found = true; 
//                break; 
//            } 
//        } 
//        if (!found) { 
//            System.out.println("Student with ID " + rid + " not found."); 
//        } 
//    } 
//    
//    public void sortStudentByMarks() { 
//        System.out.println("\nSorting Students By Marks (Highest First)..."); 
//        Collections.sort(a, new MarksComparator()); 
//        displayStudent(); 
//    } 
//    
//    public void deleteStudent() { 
//        System.out.print("\nEnter Student ID to delete: "); 
//        int rid = sc.nextInt(); 
//        boolean found = false;
//        for (int i = a.size() - 1; i >= 0; i--) { 
//            if (a.get(i).getId() == rid) { 
//                a.remove(i); 
//                System.out.println("Student with ID " + rid + " deleted successfully."); 
//                found = true;
//                break;
//            } 
//        } 
//        if (!found) {
//            System.out.println("Student ID not found."); 
//        }
//    } 
//    
//    class MarksComparator implements Comparator<Student2> { 
//        @Override 
//        public int compare(Student2 s1, Student2 s2) { 
//            return Integer.compare(s2.getMarks(), s1.getMarks()); 
//        } 
//    } 
//}
