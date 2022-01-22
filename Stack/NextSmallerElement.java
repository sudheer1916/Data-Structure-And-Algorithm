import java.util.*;
//Given an array of distinct integers, 
/*find the NextGreater(position-wise closest and on the right side) of 
  every array elements.*/
class NextSmallerElement {
    static ArrayList<Integer> nextSmaller(int arr[],int n){
        ArrayList<Integer> v = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        v.add(-1);
        for(int i = n-2;i >= 0;i--){
            while (s.isEmpty() == false && s.peek() >= arr[i]) {
                s.pop();
            }
            int ns = s.isEmpty() ? -1:s.peek();
            v.add(ns);
            s.push(arr[i]);
        }
        Collections.reverse(v);
        return v;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{6,2,5,4,1,5,6};
        for(int x: nextSmaller(arr,arr.length)){
            System.out.print(x+" ");
        }    
    }
}
