/*step1:-Detect loop using floyd detection method 
  step2:-move slow_p to the beginning and keep 
         fast_p at the meeting point
  step3:-now move one by one slow and fast at same speed
         the point where they meet now is the first node of the loop*/
class DetectAndRemoveLoop {
    static void detectRemoveLoop(Node head){
        Node slow_p = head,fast_p = head;
        while (fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if(slow_p == fast_p)
            break ;
        }
        if(slow_p != fast_p)
        return ;
        //removing of loop
        slow_p = head;
        /*Node res = fast_p;            
        while (slow_p != fast_p) {
            res = fast_p;
            slow_p = slow_p.next;       //same speed
            fast_p = fast_p.next;
        }
        res.next = null;*/
        while (slow_p.next != fast_p.next) {
            slow_p = slow_p.next;       //same speed
            fast_p = fast_p.next;
        }
        fast_p.next = null;
    }
    public static void main(String[] args) {
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
    	detectRemoveLoop(head);
        Node.printList(head);
    }
}
