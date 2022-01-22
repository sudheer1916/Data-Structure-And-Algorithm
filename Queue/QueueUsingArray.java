//all methods are O(1)
//efficient solution using cicular array
//rear = (front+size-1)%cap     //important
class QueueUsingArray{
    int front,rear,size;
    int cap;
    int[] arr;
    QueueUsingArray(int cap){
        this.cap = cap;
        arr = new int[cap];
        front = rear = 0;
        size = 0;
    }
    boolean isFull(){
        return (size==cap);
    }
    boolean isEmpty(){
        return size == 0;
    }
    void enqueue(int item){
        if(isFull()) return ;

        int rear = rearVal();
        rear = (rear+1)%cap;
        arr[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue"); 
    }
    int dequeue(){
        if(isEmpty()) return Integer.MIN_VALUE;
        int item = arr[front]; 
        front = (front+1)%cap;
        size--;
        return item;
    }
    int getFront(){
        if(isEmpty())
        return -1;
        else {
            System.out.println("Front item is at index "+front+" = "+ arr[front]);
            return front;
        }
        
    }
    int rearVal(){
        if(isEmpty())
        return -1;
        else {
            int temp = (front+size-1)%cap;
            return temp;
        }
    }
    void getRear(){
        System.out.println("rear item is at index "+rear+" = "+arr[rear]);
    }
    int size(){
        return size;
    }
}
class QueueArrayMain{
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(4);
		q.enqueue(10); 
		q.enqueue(20); 
		q.enqueue(30); 
		q.enqueue(40); 
		System.out.println(q.dequeue() + " dequeued from queue");
        System.out.println(q.dequeue() + " dequeued from queue"); 
        q.enqueue(50);
        //q.enqueue(60); 
        System.out.println();

		q.getFront();
		q.getRear();
        System.out.println("size = " + q.size());
        System.out.println("isFull = "+q.isFull());
        System.out.println("isEmpty = "+q.isEmpty());  
    }
}
/**
class Queue { 
	int front, rear, size; 
	int capacity; 
	int array[]; 

	public Queue(int capacity) 
	{ 
		this.capacity = capacity; 
		front = this.size = 0; 
		rear = capacity - 1; 
		array = new int[this.capacity]; 
	} 

	
	boolean isFull(Queue queue) 
	{ 
		return (queue.size == queue.capacity); 
	} 

	
	boolean isEmpty(Queue queue) 
	{ 
		return (queue.size == 0); 
	} 

	
	void enqueue(int item) 
	{ 
		if (isFull(this)) 
			return; 
		this.rear = (this.rear + 1) 
					% this.capacity; 
		this.array[this.rear] = item; 
		this.size = this.size + 1; 
		System.out.println(item 
						+ " enqueued to queue"); 
	} 

	
	int dequeue() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		int item = this.array[this.front]; 
		this.front = (this.front + 1) 
					% this.capacity; 
		this.size = this.size - 1; 
		return item; 
	} 

	
	int front() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		return this.array[this.front]; 
	} 

	
	int rear() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		return this.array[this.rear]; 
	} 
} 

 
public class Test { 
	public static void main(String[] args) 
	{ 
		Queue queue = new Queue(1000); 

		queue.enqueue(10); 
		queue.enqueue(20); 
		queue.enqueue(30); 
		queue.enqueue(40); 

		System.out.println(queue.dequeue() 
						+ " dequeued from queue\n"); 

		System.out.println("Front item is "
						+ queue.front()); 

		System.out.println("Rear item is "
						+ queue.rear()); 
	} 
} 
 */