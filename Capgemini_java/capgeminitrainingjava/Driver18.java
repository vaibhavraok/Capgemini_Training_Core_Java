package capgeminitrainingjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1class { 
    int id;
    String name;

    Student1class(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}

// helper class that implements Comparator
class helperclass implements Comparator<Student1class> {
    @Override
    public int compare(Student1class s1, Student1class s2) {
        return s1.id-s2.id; 
    }
}

class Driver18 {
    public static void main(String[] args) {
        ArrayList<Student1class> a = new ArrayList<>();
        a.add(new Student1class(12, "RAM"));
        a.add(new Student1class(13, "ROM"));
//        a.add(new Student1class(23, "Suhail"));
//        a.add(new Student1class(44, "Kruthik"));

        System.out.println("Original: " + a);
        

        Collections.sort(a, new helperclass()); 

        System.out.println("Sorted by Name: " + a);
    }
}
