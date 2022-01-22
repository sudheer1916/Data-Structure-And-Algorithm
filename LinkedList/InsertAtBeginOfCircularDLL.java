class InsertAtBeginOfCircularDLL {
    static NodeD insertAtHead(NodeD head,int data){
        NodeD temp = new NodeD(data);
        if(head == null){
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        temp.prev = head.prev;
        temp.next = head;
        head.prev.next = temp;
        head.prev = temp;
        
        return temp;
    }
    public static void main(String[] args) {
        NodeD head=new NodeD(10);
    	NodeD temp1=new NodeD(20);
    	NodeD temp2=new NodeD(30);
    	head.next=temp1;
    	temp1.next=temp2;
    	temp2.next=head;
    	temp2.prev=temp1;
    	temp1.prev=head;
    	head.prev=temp2;
        NodeD.circularPrintList(head);
    	head=insertAtHead(head,5);
        NodeD.circularPrintList(head);
    }
}
