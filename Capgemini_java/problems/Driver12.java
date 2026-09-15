//package problems;
//abstract class Employee {
//    private int employeeId;
//    private String name;
//    private double baseSalary;
//
//    public Employee(int employeeId, String name, double baseSalary) {
//        this.employeeId = employeeId;
//        this.name = name;
//        this.baseSalary = baseSalary;
//    }
//
//    public int getEmployeeId() {
//        return this.employeeId;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public double getBaseSalary() {
//        return this.baseSalary;
//    }
//
//    public abstract double calculateBonus();
//    public abstract double calculateTotalSalary();
//}
//
//class Manager extends Employee1 {
//    
//    public Manager(int employeeId, String name, double baseSalary) {
//        super(employeeId, name, baseSalary);
//    }
//
//
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
//class Developer extends Employee1 {
//
//    public Developer(int employeeId, String name, double baseSalary) {
//        super(employeeId, name, baseSalary);
//    }
//
//
//    public double calculateBonus() {
//        return getBaseSalary() * 0.10;
//    }
//
//
//    public double calculateTotalSalary() {
//        return getBaseSalary() + calculateBonus();
//    }
//}
//
//public class Driver12 {
//    public static void main(String[] args) {
//        Employee1 mgr = new Manager1(101, "Smith", 80000.0);
//        Employee1 dev = new Developer1(102, "John", 60000.0);
//
//        System.out.println("--- Manager Details ---");
//        System.out.println("ID: " + mgr.getEmployeeId() + "  Name: " + mgr.getName());
//        System.out.println("Base Salary: $" + mgr.getBaseSalary());
//        System.out.println("Bonus: $" + mgr.calculateBonus());
//        System.out.println("Total Salary: $" + mgr.calculateTotalSalary());
//
//        System.out.println();
//
//        System.out.println("--- Developer Details ---");
//        System.out.println("ID: " + dev.getEmployeeId() + "  Name: " + dev.getName());
//        System.out.println("Base Salary: $" + dev.getBaseSalary());
//        System.out.println("Bonus: $" + dev.calculateBonus());
//        System.out.println("Total Salary: $" + dev.calculateTotalSalary());
//    }
//}
