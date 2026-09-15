package capgeminitrainingjava;
import java.util.*;

class rightrotate {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        // Fixed: Increased size to 4 to match your print statement below
        int[] arr = new int[4]; 
        System.out.println("Enter 4 arr int numbers");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original array:");
        for(int ele : arr) {
            System.out.println(ele);
        }
        
        System.out.println("Right rotate");
        
        // Save the very last element because it will be overwritten first
        int last = arr[arr.length - 1]; 
        int pre = last; 
        
        // Loop backwards to shift elements to the right
        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Put the saved last element into the first position
        arr[0] = pre; 
        
        System.out.println("Rotated array:");
        for(int ele : arr) {
            System.out.println(ele);
        }
    }
}
