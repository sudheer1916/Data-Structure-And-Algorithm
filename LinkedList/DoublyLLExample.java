class DoublyLLExample{
    public static void main(String[] args) {
        NodeD head = new NodeD(10);
        NodeD temp1 = new NodeD(20);
        NodeD temp2 = new NodeD(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        NodeD.printList(head);
    }
}