import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

class DequeExample{
    public static void main(String[] args) {
        //functions do not throw Exceptions (automatically handles exceptions)
        /*Deque<Integer> d = new LinkedList<>();
        d.offerFirst(10);
        d.offerLast(20);
        d.offerFirst(5);
        d.offerLast(15);
        System.out.println(d);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        d.pollFirst();
        d.pollLast();
        System.out.println(d);*/

        //functions throw Exceptions(if deque is empty, if we use getFirst() then it throws exception)
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);
        System.out.println(d);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        d.removeFirst();
        d.removeLast();
        System.out.println(d);

        //traversing a deque
        Iterator<Integer> it = d.iterator();
        System.out.print("Iterator = ");
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.print("for each = ");
        for(int x:d)
        System.out.print(x+" ");
        System.out.println();

        Iterator<Integer> itd = d.descendingIterator();
        System.out.print("descending iterator = ");
        while (itd.hasNext()) {
            System.out.print(itd.next()+" ");
        }
    }
}
