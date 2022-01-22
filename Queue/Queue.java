//only dequeue method is O(n),rest all are O(1)
class Queue{
    int size,cap;
    int[] arr;
    Queue(int cap){
        this.cap = cap;
        size = 0;
        arr = new int[cap];
    }
    void enqueue(int x){        
        if(isFull()) return ;
        arr[size] = x;
        size++;
    }
    int dequeue(){         //O(n)
        if(isEmpty()) return -1;
        int t = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
        return t;
    }
    int getFront(){
        if(isEmpty())
        return -1;
        else
        return arr[0];
    }
    int getRear(){
        if(isEmpty())
        return -1;
        else 
        return arr[size-1];
    }
    boolean isFull(){
        return (size==cap);
    }
    boolean isEmpty(){
        return size == 0;
    }
    int size(){
        return size;
    }
}
class QueueMain{
    public static void main(String[] args) {
        Queue q = new Queue(100);
		q.enqueue(10); 
		q.enqueue(20); 
		q.enqueue(30); 
		q.enqueue(40); 

		System.out.println(q.dequeue() + " dequeued from queue"); 
		System.out.println("Front item is "+ q.getFront()); 
		System.out.println("Rear item is "+ q.getRear()); 
        System.out.println("size = " + q.size());
        System.out.println("isFull = "+q.isFull());
        System.out.println("isEmpty = "+q.isEmpty());        
    }
}
