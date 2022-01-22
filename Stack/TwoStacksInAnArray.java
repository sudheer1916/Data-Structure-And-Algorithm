/*naive method :- it divides the array into two halfs and inserts elements
                  prblm with method is if the first/last half is full, then
                  if we want to insert another element into fulled half,we can't
                  do it even if we have space in the array.
*/
class TwoStacksInAnArray {
    /*
    int arr[];              //naive method
    int cap; 
    int top1, top2; 
  
    TwoStacksInAnArray(int n) 
    { 
        cap = n; 
        arr = new int[n]; 
        top1 = n / 2 + 1; 
        top2 = n / 2; 
    } 
  
    void push1(int x) 
    { 
        if (top1 > 0) { 
            top1--; 
            arr[top1] = x; 
        } 
        else { 
            System.out.println("Stack Overflow By element :" + x ); 
            return; 
        } 
    } 
 
    void push2(int x) 
    { 
        if (top2 < cap - 1) { 
            top2++; 
            arr[top2] = x; 
        } 
        else { 
            System.out.println("Stack Overflow By element :" + x ); 
            return; 
        } 
    } 
   
    int pop1() 
    { 
        if (top1 <= cap / 2) { 
            int x = arr[top1]; 
            top1++; 
            return x; 
        } 
        else { 
            System.out.println("Stack UnderFlow"); 
            System.exit(1); 
        }
        return 0;
    } 
  
    int pop2() 
    { 
        if (top2 >= cap / 2 + 1) { 
            int x = arr[top2]; 
            top2--; 
            return x; 
        } 
        else { 
            System.out.println("Stack UnderFlow"); 
            System.exit(1); 
        }
        return 0;
    } 
    */
    
    int cap;                //efficient
    int top1,top2;
    int arr[];
    TwoStacksInAnArray(int x){
        cap = x;
        arr = new int[cap];
        top1 = -1;
        top2 = cap;
    }

    void push1(int x){
        if(top1 < top2-1){
            top1++;
            arr[top1] = x;
        }else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    void push2(int x){
        if(top1 < top2-1){
            top2--;
            arr[top2] = x;
        }else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    int pop1(){
        if(top1 >= 0){
            int x = arr[top1];
            top1--;
            return x;
        }else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
    int pop2(){
        if (top2 < cap) { 
            int x = arr[top2]; 
            top2++; 
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow"); 
            System.exit(1); 
        } 
        return 0; 
    }

    public static void main(String[] args) {
	    TwoStacksInAnArray ts=new TwoStacksInAnArray(5); 
        ts.push1(5); 
        ts.push2(10); 
        ts.push2(15); 
        ts.push1(11); 
        ts.push2(7); 
        System.out.println("Popped element from stack1 is: " + ts.pop1()); 
        ts.push2(40); 
        System.out.println("Popped element from stack2 is: " + ts.pop2());        
    }
}
