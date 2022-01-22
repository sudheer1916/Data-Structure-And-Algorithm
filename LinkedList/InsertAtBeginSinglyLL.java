//Java codes for insert at the beginning of Singly Linked List
class InsertAtBeginSinglyLL {
    static Node insertBegin(Node head,int data){        //O(1)
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }
    static void printList(Node head){           
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head,30);
        head = insertBegin(head,20);
        head = insertBegin(head,10);
        printList(head);
    }
}
