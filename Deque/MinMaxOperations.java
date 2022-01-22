import java.util.ArrayDeque;
import java.util.Deque;

//Design a Data Structure with Min and Max operations
/*designing a data structure that supports the following operations in O(1) time.
1) Get Minimum
2) Get Maximum
3) Insert Minimum
4) Insert Maximum
5) Delete Minimum
6) Delete Maximum
*/
class MinMaxOperations {
    class MyDq{
        Deque <Integer> dq;
        MyDq(){
            dq = new ArrayDeque<>();
        }
        void insertMin(int x){
            dq.offerFirst(x);
        }
        void insertMax(int x){
            dq.offerLast(x);
        }
        int getMin(){
            return dq.peekFirst();
        }
        int getMax(){
            return dq.peekLast();
        }
        int extractMin(){
            return dq.pollFirst();
        }
        int extractMax(){
            return dq.pollLast();
        }
    }
    public static void main(String[] args) {
        MinMaxOperations mm = new  MinMaxOperations();
        MyDq ds = mm.new MyDq();
        ds.insertMin(10);
        ds.insertMax(25);
        ds.insertMin(5);
        System.out.println(ds.getMax());
        System.out.println(ds.getMin());
        ds.extractMin();
        ds.extractMax();
        
        ds.insertMax(56);
        System.out.println(ds.getMax());
        System.out.println(ds.getMin());
    }
}
