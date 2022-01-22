class InsertAtEndOfCircularSLL {
    /*static Node insertEndC(Node head, int data){
        Node temp = new Node(data);         //naive O(n)
        if(head == null){
            temp.next = temp;
            return temp;
        }
        else{
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;    
        }
        return head;
    }*/

    static Node insertEndC(Node head, int data){
        Node temp = new Node(data);         //efficient O(1)
        if(head == null){
            temp.next = temp;
            return temp;
        }
        else{
            //insert temp after head
            temp.next = head.next;
            head.next = temp;
            //swap temp.data with head.data
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            
            return temp;     //temp is now new head
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=head;
        Node.circularPrintList(head);
    	head=insertEndC(head,15);
    	Node.circularPrintList(head);
    }
}
