class DeleteFirstNodeOfSinglyLL {       //O(1)
    static Node delHead(Node head){
        if(head == null)
        return null;
        else 
        return head.next;
    }
    static void printList(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printList(head);
        System.out.println();
        head = delHead(head);
        printList(head);
    }
}
