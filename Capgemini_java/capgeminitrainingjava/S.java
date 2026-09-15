package capgeminitrainingjava;
import java.util.ArrayList;

class Student1 {
    int id;
    String name;

    // Constructor to initialize the variables
    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() { 
        return "Id: " + id + " Name: " + name; 
    }
}

class S { 
    public static void main(String[] args) { 
        // Created the list
        ArrayList<Student1> a = new ArrayList<Student1>(); 
        
        a.add(new Student1(13, "Chintu")); 
        a.add(new Student1(23, "Appu")); 
        
        System.out.println(a); 
    } 
}