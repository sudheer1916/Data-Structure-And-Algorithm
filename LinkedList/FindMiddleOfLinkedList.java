class FindMiddleOfLinkedList {
    /*static void printMiddle(Node head){
        if(head == null)            //naive
        return ; 
        int count = 0;
        Node r;
        for(r=head;r.next!=null;r=r.next){
            count++;
        }
        r=head;
        for(int i=0;i<=(count/2);i++){
            r=r.next;
        }
        System.out.print(r.data+" ");
    }*/

    static void printMiddle(Node head){
        if(head == null)            //efficient
        return ;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
    	head.next.next.next.next=new Node(50);
        //head.next.next.next.next.next=new Node(60);
    	Node.printList(head);
    	System.out.print("Position of element in Linked List: ");
    	printMiddle(head);
    }
}
