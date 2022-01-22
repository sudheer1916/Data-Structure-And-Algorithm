import java.util.Stack;
//Design a stack that supports normal stack operatiosn in O(1) 
//and also supprots getMin() in O(1) but O(n) space used.


class StackWith_getMinOperation {

    class MyStack{
        Stack<Integer> mainStk;
        Stack<Integer> auxStk;      //to store minimum element at the top
        MyStack(){
            mainStk = new Stack<>();
            auxStk = new Stack<>();
        }
        void push(int x){
            if(mainStk.isEmpty()){      //base case so,push to both stacks
                mainStk.add(x);
                auxStk.add(x);
            }
            mainStk.add(x);
            if(mainStk.peek() <= auxStk.peek())
            auxStk.add(x);
        }
        void pop(){
            if(auxStk.peek() == mainStk.peek())
            auxStk.pop();
    
            mainStk.pop();
        }
        int top(){
            return mainStk.peek();
        }
        int getMin(){
            return auxStk.peek();
        }
    }

    public static void main(String[] args) {
        StackWith_getMinOperation obj = new StackWith_getMinOperation();
        MyStack s=obj.new MyStack();
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();
        System.out.print("Minimum Element from Stack: " + s.getMin() );
    }
}
