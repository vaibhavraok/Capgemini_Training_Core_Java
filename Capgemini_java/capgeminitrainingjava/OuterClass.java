package capgeminitrainingjava;
class OuterClass {
    //private String outerField = "Hello from Outer Class!";

    // Non-static inner class
    class InnerClass {
        void display() {
            // Direct access to private outer field
            System.out.println("Hello from Outer Class!"); 
        }
    }

    public static void main(String[] args) {
        // Step 1: Instantiate the outer class
        OuterClass outerObj = new OuterClass();

        // Step 2: Instantiate the inner class using the outer instance
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

        // Call the method
        innerObj.display(); // Outputs: Hello from Outer Class!
    }
}
