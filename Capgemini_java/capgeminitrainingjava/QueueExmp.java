package capgeminitrainingjava;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExmp {
	

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(30);
        q.add(5);
        System.out.println(q);
//        q.poll();
//        q.poll();
//        	
        for(int ele:q) {
        	if(ele==30) {
        		q.remove(30);
        	}
        }
        System.out.println(q);
//        // 1. Enqueue: Add elements to the end of the queue
//        line.offer("Alice");
//        line.offer("Bob");
//        line.offer("Charlie");
//        System.out.println("Initial Queue: " + line); 
//        // Output: [Alice, Bob, Charlie]
//
//        // 2. Peek: Look at the element at the front without removing it
//        String frontElement = line.peek();
//        System.out.println("Front element (peek): " + frontElement); 
//        // Output: Alice
//
//        // 3. Dequeue: Remove and return the element at the front
//        String removedElement = line.poll();
//        System.out.println("Removed element (poll): " + removedElement); 
//        // Output: Alice
//
//        // Queue after removing the first element
//        System.out.println("Queue after poll: " + line); 
//        // Output: [Bob, Charlie]
//
//        // 4. Check size and if it contains an element
//        System.out.println("Queue size: " + line.size()); // Output: 2
//        System.out.println("Contains 'Bob'? " + line.contains("Bob")); // Output: true
//
//        // 5. Clear remaining elements sequentially
////        while (!line.isEmpty()) {
////            System.out.println("Served: " + line.poll());
//        }
    }
}
}
