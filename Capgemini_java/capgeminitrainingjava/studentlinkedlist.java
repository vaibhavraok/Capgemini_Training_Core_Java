package capgeminitrainingjava;
import java.util.ArrayList;
import java.util.Collections;

class studentlinkedlist implements Comparable<studentlinkedlist> {
    int id;
    String name;

    studentlinkedlist(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override 
    public int compareTo(studentlinkedlist s) {
        return this.id - s.id; // Sorts by ID in ascending order
    }
}

class Driver16 {
    public static void main(String[] args) {
      
        ArrayList<studentlinkedlist> a = new ArrayList<>();
        
        a.add(new studentlinkedlist(12, "Nithin"));
        a.add(new studentlinkedlist(13, "Vaibhav"));
        a.add(new studentlinkedlist(23, "Suhail"));
        a.add(new studentlinkedlist(44, "Kruthik"));
        
        System.out.println("Original: " + a);
        
        
//        Collections.sort(a);
        
        Collections.reverse(a);
        System.out.println();
        System.out.println(a);
    }
}
