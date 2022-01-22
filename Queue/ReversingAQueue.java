import java.util.LinkedList;
import java.util.Queue;
//import java.util.Stack;

class ReversingAQueue {
    static Queue<Integer> queue;

    /*static void reverse(){              //iterative1
        Stack<Integer> s = new Stack<>();
        while (!queue.isEmpty()) {
            s.add(queue.remove());
            
        }
        while (!s.isEmpty()) {
            queue.add(s.pop());
        }
    }*/

    /*static void reverse(Queue<Integer> queue){           //iterative2
        Stack<Integer> s = new Stack<>();
        while (!queue.isEmpty()) {
            s.add(queue.remove());
            
        }
        while (!s.isEmpty()) {
            queue.add(s.pop());
        }
    }*/
    
    static void reverse(Queue<Integer> q){          //recursion 
        if(q.isEmpty()) return ;

        int x = q.remove();
        reverse(q);
        q.add(x);
    }

    public static void main(String[] args) {
        //queue = new LinkedList<Integer>();            //iterative1
        Queue<Integer> queue = new LinkedList<>();      //iterative2   and  //recursion
        queue.add(12);
        queue.add(5);
        queue.add(15);
        queue.add(20);
        for (Integer e : queue) {
            System.out.print(e+" ");
        }
        System.out.println();
        //reverse();                    //iterative1
        reverse(queue);                 //iterative2  and //recursion
        for (Integer e : queue) {
            System.out.print(e+" ");
        }
    }
}
