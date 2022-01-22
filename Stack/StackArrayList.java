import java.util.ArrayList;

class StackArrayList {
    ArrayList<Integer> arr = new ArrayList<>();
    void push(int x){
        arr.add(x);
    }
    int pop(){
        int res = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return res;
    }
    int peek(){
        return arr.get(arr.size()-1);
    }
    int size(){
        return arr.size();
    }
    boolean isEmpty(){
        return arr.isEmpty();
    }
}
class StackMain{
    public static void main(String[] args) {
        StackArrayList stk = new StackArrayList();
        stk.push(5);
        stk.push(10);
        stk.push(20);
        System.out.println(stk.pop());
        System.out.println(stk.size());
        System.out.println(stk.peek());
        System.out.println(stk.isEmpty());
    }
}
