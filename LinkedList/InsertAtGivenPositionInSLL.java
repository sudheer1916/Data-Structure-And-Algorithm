class InsertAtGivenPositionInSLL {
    static Node insertPos(Node head,int pos,int data){
        Node temp = new Node(data);
        if(pos == 1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i = 1;i <= pos-2; i++){
            curr = curr.next;
        }
        if(curr == null)
        return head;
        temp.next = curr.next;
        curr.next = temp;
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
        int pos = 3;
        int data = 25;
        head = insertPos(head,pos,data);
        printList(head);
    }
}
