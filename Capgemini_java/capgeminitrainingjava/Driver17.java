package capgeminitrainingjava;
import java.util.ArrayList;
import java.util.Collections;

class stll implements Comparable<stll> {
    int id;
    String name;

    stll(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override 
    public int compareTo(stll s) {
        return this.name.compareTo(s.name); 
    }
}

class Driver17 {
    public static void main(String[] args) {
      
        ArrayList<stll> a = new ArrayList<>();
        
        a.add(new stll(12, "Nithin"));
        a.add(new stll(13, "Vaibhav"));
        a.add(new stll(23, "Suhail"));
        a.add(new stll(44, "Kruthik"));
        
        System.out.println("Original: " + a);
        
        
        Collections.sort(a);
        
//        Collections.reverse(a);
//        System.out.println();
        System.out.println(a);
    }
}
