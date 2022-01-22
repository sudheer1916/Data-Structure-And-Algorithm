import java.util.ArrayDeque;
//import java.util.Stack;

/*
-> In java collections ,Stacks are supported using two predefined class
1) Stack
   Stack is child of vector,vector implements list interface,list is the 
   child of Collection interface. 
2) ArrayDeque
   ArrayDeque implements Deque interface, Deque is child of Queue interface
   Queue is child of Collection interface(root)

-> From both the data structer, we have to use ArrayDeque because 
   in single threaded environment we should use ArrayDeque only.
*/
public class StackInJavaCollections {
    public static void main(String[] args) {
        //Stack<Integer> stk = new Stack<>();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(20);
        s.push(30);
        //below each function T.C = O(1)
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
