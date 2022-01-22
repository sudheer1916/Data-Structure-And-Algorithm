import java.util.Collections;
import java.util.PriorityQueue;
//Priority Queue implements Heap data structure 
//default implementation of PriorityQueue is Minheap
public class PriorityQueueInJava {
    /*public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //minHeap
        pq.add(10);
        pq.add(20);
        pq.add(15);
        // Above PriorityQueue is stored as following
        //       10
        //      /  \
        //    20    15
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        //poll function removes the top element and calls minheapify
        // Post poll() PriorityQueue looks like
        //       15
        //      /  
        //    20   
        System.out.println(pq.peek());
    }*/

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(15);
        // Above PriorityQueue is stored as following
        //       20
        //      /  \
        //    10    15
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        //poll function removes the top element and calls maxheapify
        // Post poll() PriorityQueue looks like
        //       15
        //      /  
        //    10   
        System.out.println(pq.peek());
    }
}
