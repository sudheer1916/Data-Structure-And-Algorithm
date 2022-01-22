class InsertAtEndOfDoublyLL {
    static NodeD insertEnd(NodeD newNode,int data){
        NodeD temp = new NodeD(data);
        if(newNode == null)             //for empty linkedlist
        return temp;
        NodeD curr = newNode;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return newNode;
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
        int data = 35; 
        NodeD updated = insertEnd(head,data);
        NodeD.printList(updated);
    }
}
