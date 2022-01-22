/*This is one of the tricky problem asked in an interview 
where a random address to a node of the linked list is given and 
the user needs to delete the node of the given address. 
The address can point to any random node in-between a linked list.*/
//the delete node will never be the last node
public class DeleteNodeWithGivenPointer {
    static void deleteNode(Node ptr){
        ptr.data = ptr.next.data;
        ptr.next = ptr.next.next;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
    	head.next=new Node(20);
    	Node ptr=new Node(30);
	    head.next.next=ptr;
    	head.next.next.next=new Node(40);
    	head.next.next.next.next=new Node(25);
    	Node.printList(head);
	    deleteNode(ptr);
    	Node.printList(head);
    }
}
