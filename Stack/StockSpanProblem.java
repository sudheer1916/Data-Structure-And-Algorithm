import java.util.Stack;

/*
we are given an array of integers which represents prices of a stock 
of n consequtive days. our task is to find out span of stock everyday.
span on a day :- no of consecutives days (including current day) and the 
days just before it(left side of array) which have values smaller or equal.
on day 1 the span is always 1.  
*/
class StockSpanProblem {
    /*static void printSpan(int arr[], int n){    //naive O(n^2)
        for (int i = 0; i < arr.length; i++) {
            int span = 1;
            for (int j = i-1; j>=0 && arr[j] <= arr[i]; j--) {
                span++;
            }
            System.out.print(span + " ");
        }
    }*/
    static void printSpan(int arr[],int n){     //efficient (advanced)
        Stack<Integer> s = new Stack<>();       //theta(n)
        s.add(0);
        System.out.print(1+" ");
        for(int i = 1;i<n;i++){
            while (s.isEmpty() == false && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            int span = s.isEmpty() ? i+1 : i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{18,12,13,14,11,16};
        printSpan(arr,arr.length);
    }
}
