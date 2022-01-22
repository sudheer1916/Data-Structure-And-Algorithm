import java.util.*;

//Given an array of distinct integers, 
/*find the NextGreater(position-wise closest and on the right side) of 
  every array elements.*/
class NextGreaterElement {
    /*static void printGreater(int arr[],int n){  //naive O(n^2)
    
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==n)
                System.out.print(-1+" ");
        }
    }*/

    /*//this method prints output in reverse order   //efficient1 O(n) 
    static void printGreater(int arr[],int n){
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(arr[n-1]);
        System.out.print(-1+" ");
        for(int i=n-2;i>=0;i--){
            while (s.isEmpty()==false && s.peek()<=arr[i]) {
                s.pop();
            }
            int top = s.isEmpty() ? -1:s.peek();
            System.out.print(top+" ");
            s.push(arr[i]);
        }    
    }*/

    static ArrayList<Integer> nextGreater(int arr[],int n){
        ArrayList<Integer> v = new ArrayList<>();       //efficient2 O(n)
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        v.add(-1);
        for(int i=n-2;i>=0;i--){
            while (s.isEmpty() == false && s.peek() <= arr[i]) {
                s.pop();
            }
            int ng = s.isEmpty() ? -1:s.peek();
            v.add(ng);
            s.push(arr[i]);
        }
        Collections.reverse(v);
        return v;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{5,15,10,8,6,12,9,18};
        /* use it for naive and efficient1
        printGreater(arr,arr.length);    */
        for(int x: nextGreater(arr,arr.length)){
            System.out.print(x+" ");
        }
    }
}
