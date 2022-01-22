import java.util.ArrayDeque;
import java.util.Deque;

//Maximums of all subarrays of size k
//We are given an array and a number k,
// we need to find maximums of all subarrays of size k.
//deque is maintained such that it is in decreasing order
class MaximumsOfSucArray {
    static void printMax(int[] arr,int len,int k){
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(int j=k;j<len;j++){
            System.out.print(arr[dq.peekFirst()]+" ");
            while (!dq.isEmpty() && dq.peekFirst()<=(j-k)) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[j]>= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(j);
        }
        System.out.print(arr[dq.peek()]+" ");
    }
    public static void main(String[] args) {
        int arr[] = { 20, 40, 30, 10, 60};
        int k = 3;
        printMax(arr, arr.length, k);
    }
}
