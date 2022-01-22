import java.util.Stack;

//Design A Stack With Get Min() in O(1) Space
//method 1 -> Assuming all Elements Positive
//method 2 -> handles negatives also and this method is variation method 1
class StackWith_getMinOperation1 {
    /*class MyStack{          //method 1
        Stack<Integer> s;
        int min;
        MyStack(){
            s=new Stack<>();
        }
    
        void push(int x){
            if(s.empty()){
                min=x;
                s.push(x);
            }else if(x<=min){
                s.add(x-min);       //-ve value
                min=x;
            }else{
                s.add(x);
            }
        }
        int pop(){
            int t = s.peek();
            s.pop();        //removes from stack s
            if(t <= 0){     //if -ve then we should change min value also
                int res = min;      //stores curr min in res
                min = min - t; //let t=-3 and curr min = 2,then min is changed to 2-(-3) = 5     
                return res;
            }else
            return t;
        }
        int peek(){
            int t = s.peek();
            return (t<=0 ? min:t);  //if t is -ve : return min else return t
        }
        int getMin(){
            return min;
        }
    }*/

    class MyStack{          //method 2
        Stack<Integer> s;
        int min;
        MyStack(){
            s=new Stack<>();
        }

        void push(int x){
            if(s.empty()){
                min = x;
                s.add(x);
            }else if(x<min){
                s.add(2*x-min);
                min = x;
            }else
            s.add(x);
        }
        int pop(){
            int t = s.peek();
            s.pop();
            if(t<=min){
                int res = min;
                min = 2*min-t;
                return res;
            }else
            return t;
        }
        int peek(){
            int t = s.peek();
            return (t<=min ? min:t);
        }
        int getMin(){
            return min;
        }
    }
    public static void main(String[] args) {
        StackWith_getMinOperation1 obj = new StackWith_getMinOperation1();
        MyStack s=obj.new MyStack();
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();
        System.out.print("Minimum Element from Stack: " + s.getMin() );
    }
}
