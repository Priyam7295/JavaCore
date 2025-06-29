package collections;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// Implemented by:
// 1. LinkedList<E> (most common)
// 2. PriorityQueue<E>
// 3. ArrayDeque<E>


public class _13queue {
    public static void main(String[] args) {
        // 1.
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println("Queue Size:" + queue.size());

        System.out.println(queue.peek());

        queue.remove();

        System.out.println(queue.peek());

        System.out.println("\n\n\n");
        
        // 2. . Deque (Double-ended Queue)
        // Supports stack and queue operations, both ends.
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        dq.addFirst(1);   // push to front
        dq.addLast(2);    // push to back
        dq.removeFirst(); // pop from front
        dq.removeLast();  // pop from back
        dq.peekFirst();   // front
        dq.peekLast();  
        
        System.out.println("\n\n\n");

        // 3. PriorityQueue

        // Elements are ordered based on their natural ordering or by a comparator provided at queue construction time.
        Queue<Integer> pq = new PriorityQueue<>(); //min Heap
        pq.add(5);  
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(4);
        pq.add(-13);


        while(!pq.isEmpty()) {
            System.out.println(pq.peek()); 
            pq.remove();
        }


        // max heap by custom comparator
        Comparator<Integer> myComp = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if(a<b) return 1; 
                else if(a>b) return -1;
                else return 0;
            }
        };

        Queue<Integer> maxHeap = new PriorityQueue<>(myComp );

        maxHeap.add(5);  
        maxHeap.add(1);
        maxHeap.add(3);
        maxHeap.add(2);
        maxHeap.add(4);
        maxHeap.add(-13);

        
        while(!maxHeap.isEmpty()) {
            System.out.println(maxHeap.peek()); 
            maxHeap.remove();
        }


        
    }
}
