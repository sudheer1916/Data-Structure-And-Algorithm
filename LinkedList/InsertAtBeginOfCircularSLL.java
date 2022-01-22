class InsertAtBeginOfCircularSLL{
    /*static Node insertBegin(Node head,int data){
        Node temp = new Node(data);             //Naive : O(n)
        if(head == null)        //if linkedlist is empty
        temp.next = temp;
        else{
        Node curr = head;
        while (curr.next != head) {
            curr  = curr.next;
        }
        curr.next = temp;
        temp.next = head;
        }
        return temp;
    }*/

    static Node insertBegin(Node head,int data){
        Node temp = new Node(data);         //efficint O(1)
        if(head == null){
            temp.next = head;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        //swap temp and head
        int t = head.data;
        head.data = temp.data;
        temp.data = t;
        return head;            //head.data is swapped, not head with temp 
    }
    public static void main(String[] args) {
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=head;
        Node.circularPrintList(head);
    	head=insertBegin(head,15);
    	Node.circularPrintList(head);
    }
}