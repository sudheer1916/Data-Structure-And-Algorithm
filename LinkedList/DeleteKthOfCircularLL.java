//deleting kth node of a circular linked list 
//where k is less than or equal to the number of nodes in the list.
class DeleteKthOfCircularLL {
    static Node delHead(Node head){
        //Node temp = head;
        if(head == null || head.next == null) return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
    static Node delKth(Node head,int pos){
        //if(head == null || head.next == null) return null;
        if(pos == 1) return delHead(head);
        Node curr = head;
        for(int i=0;i<pos-2;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
        head.next.next.next=new Node(40);
    	head.next.next.next.next=head;
        Node.circularPrintList(head);
    	head=delKth(head,1);
    	Node.circularPrintList(head);
    }
}
