import java.util.ArrayDeque;

class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        //1) ArrayDeque in Java
        /*ad.add(10);
        ad.add(20);
        ad.add(30);
        System.out.println(ad);*/

        //2)ArrayDeque as Queue     //FIFO 
        //add(),remove(),element() throws exceptions
        //offer(),poll(),peek() return null/false
        /*ad.offer(10);       //Add items to the last of queue
        ad.offer(20);

        System.out.println(ad.peek());  // Returns the front of queue, 10
        System.out.println(ad.poll());  // Returns and Removes the front of queue, 10
        System.out.println(ad.peek());
        ad.offer(40);
        System.out.println(ad);*/

        //3)ArrayDeque as Stack
        /*ad.push(10);
        ad.push(20);
        System.out.println(ad.peek());
        ad.pop();
        ad.push(40);
        System.out.println(ad);*/

        //4)ArrayDeque as Deque
        //addFirst(),addLast(),removeFirst(),removeLast(),getFirst(),getLast() throws exception
        //offerFirst(),offerLast(),pollFirst(),pollLast(),peekFirst(),peekLast() dont throw exception
        ad.offerFirst(10);
        ad.offerLast(5);
        ad.offerFirst(40);
        ad.offerLast(5);

        System.out.println(ad);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        ad.pollFirst();
        ad.pollLast();
        ad.offerFirst(89);
        ad.offerLast(69);
        System.out.println(ad);
        
    }
}
