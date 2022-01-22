//import java.util.Arrays;
//import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class K_LargestElements {
    /*static void firstKElements(int[] arr,int n,int k){  //naive
        Arrays.sort(arr);       //using  sort  T.c = O(nlogn) + O(k)
        while (k > 0) {
            System.out.println(arr[n-1]);
            n--;
            k--;
        }
    }*/
    /*static void firstKElements(int[] arr,int n,int k){    //better
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {    //using maxHeap
            pq.add(arr[i]);                       //O(n) + O(klogn)
        }
        for (int i = 0; i < k; i++) {
            System.out.println(pq.poll());
        }
    }*/
    static void firstKElements(int[] arr,int n,int k){     //efficient
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for(int i = k;i<n;i++){
            if(pq.peek() > arr[i])
            continue;
            else{
                pq.poll();
                pq.add(arr[i]);
            }
        }
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
	    int size = arr.length;
	    int k = 3;
	
	    firstKElements(arr, size, k);
    }
}
