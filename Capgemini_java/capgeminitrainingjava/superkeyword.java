package capgeminitrainingjava;


class fat{ 
    String name="suresh"; 
    int age=40; 
    
    public void fatDetails() { 
        System.out.println("Father name: " + name); 
        System.out.println("Father age: " + age); 
    } 
} 

class so extends fat { 
    String name="kiran"; 
    int age=23; 
    
    public void soDetails() { 
        System.out.println("Son name: " + name); 
        System.out.println("Son age: " + age); 
        System.out.println("Son name: " + super.name); 
        System.out.println("Son age: " + super.age); 
    } 
} 

class superkeyword { 
    public static void main(String[] args) { 
        so s = new so(); 
        s.soDetails(); 
        
    } 
}
