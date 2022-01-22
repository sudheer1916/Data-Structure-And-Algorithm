public class StackLinkedList {
    class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }

    Node head;
    int sz;             //size variable to find size of LinkedList
    StackLinkedList(){
        head = null;
        sz = 0;             //initial size = 0;
    }
    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        sz++;         //if a element is inserted,then size is incremented
    }
    int pop(){
        if(head == null)
        return Integer.MAX_VALUE;
        int res = head.data;
        //Node temp = head;
        head = head.next;
        sz--;
        return res;
    }
    int peek(){
        if(head == null)
        return Integer.MAX_VALUE;
        return head.data;
    }
    int size(){
        return sz;
    }
    boolean isEmpty(){
        return head==null;
    }
}
class StackLinkedListMain{
    public static void main(String[] args) {
    StackLinkedList s=new StackLinkedList();
    s.push(5);
    s.push(10);
    s.push(20);
    System.out.println(s.pop());
    System.out.println(s.size());
    System.out.println(s.peek());
    System.out.println(s.isEmpty());
    }
}
