import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
//numbers are uniformly distributed

    static void bucketSort(int arr[],int n,int k){
        //find max value
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        max++;

        //fill buckets
        ArrayList<ArrayList<Integer>> bkt = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < k; i++) {
            bkt.add(new ArrayList<>());
        }
        for (int j = 0; j < arr.length; j++) {
            int bi = (k * arr[j])/max;
            bkt.get(bi).add(arr[j]);
        }

        //sort individual buckets
        for (int i = 0; i < k; i++) {
            Collections.sort(bkt.get(i));
        }

        //join buckets
        int index = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < bkt.get(i).size(); j++) {
                arr[index++] = bkt.get(i).get(j);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 30,40,10,80,5,12,70 };
        int n = arr.length; int k=4;
        bucketSort(arr, n, k); 
   
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " ");
    }
}
