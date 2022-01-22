class CircularLLExample {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        //Node.printList(head);             output = infinity
        Node.circularPrintList(head);
    }
}
