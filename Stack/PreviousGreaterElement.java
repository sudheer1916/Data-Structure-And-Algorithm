import java.util.ArrayDeque;
//import java.util.Stack;

/*
Given an array of distinct integers, 
find the closest (positive wise) greater on left of every element. 
If there is no greater element on left, then print -1
*/ 

class PreviousGreaterElement {
    /*static void printPrevGreater(int arr[],int n){
        for(int i=0;i<n;i++){               //naive O(n)
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==-1)
                System.out.print(-1+" ");
        }
    }*/

    static void printPrevGreater(int arr[],int n){  //efficient O(n)
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(arr[0]);
        System.out.print(-1+" ");
        for(int i=1;i<n;i++){
            while (s.isEmpty()==false && s.peek()<=arr[i]) {
                s.pop();
            }
            int pg = s.isEmpty() ? -1:s.peek();
            System.out.print(pg+" ");
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{20,30,10,5,15};
        printPrevGreater(arr,arr.length);
    }
}
