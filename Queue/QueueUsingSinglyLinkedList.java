class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
class QueueUsingSinglyLinkedList {
    
    Node rear =null,front = null;
    int size ;
    void enqueue(int data){
        Node temp = new Node(data);
        if(rear == null && rear == null)        //linked list is empty
            front = rear = temp;
        
        rear.next = temp;   //adding new node "temp" to existing rear node
        rear = temp;        //marking new node "temp" as rear
        size++;
    }

    void dequeue(){
        if(front == null && rear == null)       //linked list is empty
            return ;

        front = front.next;
        /*
        After doing "front = front.next;",
        if the front is pointing to null then 
        it's the last node to be deleted
        */
        if(front == null)
        rear = null; 
        size--;   
    }
    int getSize(){
        return size;
    }

    public static void main(String[] args) {
        QueueUsingSinglyLinkedList q = new QueueUsingSinglyLinkedList(); 
		q.enqueue(10); 
		q.enqueue(20); 
		q.dequeue(); 
		q.dequeue(); 
		q.enqueue(30); 
		q.enqueue(40); 
		q.enqueue(50); 
		//q.dequeue(); 
		System.out.println("Queue Front : " + q.front.data); 
		System.out.println("Queue Rear : " + q.rear.data); 
        System.out.println("size : "+q.getSize());
    }
}

