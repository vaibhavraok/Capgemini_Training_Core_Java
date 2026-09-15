package projects;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

class Passenger {
    private int id;
    private String name;
    private int age;
    
    Passenger(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getStatus() {
        return "General";
    }
    
    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Age: " + age;
    }
}

class ConfirmedPassenger extends Passenger {
    private int seatNumber;
    
    ConfirmedPassenger(int id, String name, int age, int seatNumber) {
        super(id, name, age);
        this.seatNumber = seatNumber;
    }
    
    @Override
    public String getStatus() {
        return "Confirmed (Seat: " + seatNumber + ")";
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Status: " + getStatus();
    }
}

class WaitingPassenger extends Passenger {
    private int waitingNumber;
    
    WaitingPassenger(int id, String name, int age, int waitingNumber) {
        super(id, name, age);
        this.waitingNumber = waitingNumber;
    }
    
    @Override
    public String getStatus() {
        return "Waiting (WL-" + waitingNumber + ")";
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Status: " + getStatus();
    }
}

class TrainService {
    private LinkedList<Passenger> confirmedList = new LinkedList<Passenger>();
    private ArrayList<Passenger> waitingList = new ArrayList<Passenger>();
    private int maxSeats=1;
    private int seatCounter = 1;
    private int waitingCounter = 1;
    
    public TrainService(int maxSeats) {
        this.maxSeats = maxSeats;
    }
    
    public void bookTicket(int id, String name, int age) {
        if (confirmedList.size() < maxSeats) {
            Passenger p = new ConfirmedPassenger(id, name, age, seatCounter++);
            confirmedList.add(p);
            System.out.println("Ticket Booked Successfully! " + p.getStatus());
        } else {
            Passenger p = new WaitingPassenger(id, name, age, waitingCounter++);
            waitingList.add(p);
            System.out.println("Seats are full! Added to Waiting List. " + p.getStatus());
        }
    }
    
    public void displayPassenger() {
        System.out.println("\n--- Confirmed Passengers ---");
        if (confirmedList.isEmpty()) System.out.println("No confirmed passengers.");
        for (Passenger p : confirmedList) {
            System.out.println(p);
        }
        
        System.out.println("\n--- Waiting List ---");
        if (waitingList.isEmpty()) System.out.println("No passengers in waiting list.");
        for (Passenger p : waitingList) {
            System.out.println(p);
        }
    }
    
    public void cancelTicket(int id) {
        Passenger toRemove = null;
        
        for (Passenger p : confirmedList) {
            if (p.getId() == id) {
                toRemove = p;
                break;
            }
        }
        
        if (toRemove != null) {
            confirmedList.remove(toRemove);
            System.out.println("Confirmed ticket for ID " + id + " cancelled.");
            
            if (!waitingList.isEmpty()) {
                Passenger wlPassenger = waitingList.remove(0);
                String statusStr = toRemove.getStatus();
                int freedSeat = Integer.parseInt(statusStr.replaceAll("[^0-9]", ""));
                
                Passenger promoted = new ConfirmedPassenger(wlPassenger.getId(), wlPassenger.getName(), wlPassenger.getAge(), freedSeat);
                confirmedList.add(promoted);
                System.out.println("Passenger " + promoted.getName() + " promoted from Waiting List to Confirmed Seat: " + freedSeat);
            }
            return;
        }
        
        for (Passenger p : waitingList) {
            if (p.getId() == id) {
                toRemove = p;
                break;
            }
        }
        
        if (toRemove != null) {
            waitingList.remove(toRemove);
            System.out.println("Waiting list ticket for ID " + id + " cancelled.");
        } else {
            System.out.println("Passenger ID not found.");
        }
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrainService service = new TrainService(2);
        
        while (true) {
            System.out.println("\n-------- Train Booking Menu -------");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Passengers");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Passenger Id: ");
                    int id = sc.nextInt();
              
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.next();
                    System.out.print("Enter Passenger Age: ");
                    int age = sc.nextInt();
                    service.bookTicket(id, name, age);
                    break;
                    
                case 2:
                    System.out.print("Enter Passenger ID to cancel: ");
                    int cancelId = sc.nextInt();
                    service.cancelTicket(cancelId);
                    break;
                    
                case 3:
                    service.displayPassenger();
                    break;
                    
                case 4:
                    return;
                    
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
