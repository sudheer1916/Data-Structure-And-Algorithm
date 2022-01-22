public class DeleteFirstNodeOfDoublyLL {
    static NodeD delHead(NodeD head){
        if(head == null ||head.next == null)
        return null;
        head = head.next;
        head.prev = null;
        return head;
    }
    public static void main(String[] args) {
        NodeD head = new NodeD(10);
        NodeD temp1 = new NodeD(20);
        NodeD temp2 = new NodeD(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        NodeD.printList(head);         
        NodeD updated = delHead(head);
        NodeD.printList(updated);
    }
}
