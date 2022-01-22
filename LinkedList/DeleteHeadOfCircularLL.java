class DeleteHeadOfCircularLL {
    /*static Node delHead(Node head){
        if(head == null || head.next == head)
        return null;                    //naive O(n) 
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }*/
    static Node delHead(Node head){
        if(head == null || head.next == head)
        return null;                    //efficient O(1)

        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=head;
        Node.circularPrintList(head);
    	head=delHead(head);
    	Node.circularPrintList(head);
    }
}
