import java.util.*;
/*
Given an array of distinct integers, 
find the closest (positive wise) smaller on left of every element. 
If there is no smaller element on left, then print -1
*/ 
class PreviousSmallerElement {              //theta(n)
    static void printPrevSmaller(int arr[],int n){
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(arr[0]);
        System.out.print(-1+" ");
        for(int i=1;i<n;i++){
            while (s.isEmpty()==false && s.peek() >= arr[i]) {
                s.pop();
            }
            int ps = s.isEmpty() ? -1:s.peek();
            System.out.print(ps+" ");
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{6,2,5,4,1,5,6};
        printPrevSmaller(arr,arr.length);
    }
}
