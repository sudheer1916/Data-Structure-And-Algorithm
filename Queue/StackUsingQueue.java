class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int currSize;
    StackUsingQueue(){
        currSize = 0;
    }
    void push(int x){       //only push O(n)
        currSize++;
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }
    void pop(){
        if(q1.isEmpty())
        return ;
        q1.remove();
        currSize--;
    }
    int top(){
        if(q1.isEmpty())
        return -1;
        return q1.peek();
    }
    int size(){
        return currSize;
    }

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue(); 
		s.push(10); 
        s.push(5); 
        s.push(15); 
        s.push(20);
		System.out.println("current size: " + s.size()); 
		System.out.println(s.top()); 
		s.pop(); 
		System.out.println(s.top()); 
		s.pop(); 
		System.out.println(s.top()); 

		System.out.println("current size: " + s.size()); 
    }
}
