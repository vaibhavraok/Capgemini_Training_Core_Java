package capgeminitrainingjava;
abstract class Demod { 
    int b; 
    public void m1() { 
        System.out.println("Happy"); 
    } 
    abstract public void display(); 
    abstract public int add(int a, int b); 
} 

class Sample1 extends Demod { 
    public void m2() { 
        System.out.println("Partyyy"); 
    } 


    public void display() {
        System.out.println("Sad");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String [] args) { 
        Demod d = new Sample1(); 
        d.m1(); 
//        d.add(1,1);
        d.display(); 
        
    } 
}
