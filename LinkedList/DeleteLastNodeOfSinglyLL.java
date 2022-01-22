class DeleteLastNodeOfSinglyLL {
    static Node delLast(Node head){
        if(head == null || head.next == null)
        return null;
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
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
        head = delLast(head);
        printList(head);
    }
}
