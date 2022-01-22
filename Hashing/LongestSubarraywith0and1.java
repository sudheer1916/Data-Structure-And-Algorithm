import java.util.*;

//Longest Subarray with equal number of 0s and 1s
public class LongestSubarraywith0and1 {
    /*static int largestZeroSubarray(int arr[],int n){       //naive theta(n^2)
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            int c0 = 0,c1 = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] == 0)
                c0++;
                else c1++;
                if(c0 == c1)
                res = Math.max(res, c0+c1);
            }
        }
        return res;
    }*/

    static int largestZeroSubarray(int[] arr,int n){
        Map<Integer,Integer> hs = new HashMap<>();
        int prefixSum = 0,res =0;           //efficient theta(n)
        int sum = 0;
        //hs.add(0);
        for(int i = 0; i < n; i++)
        arr[i] = (arr[i] == 0) ? -1 : 1;
        
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if(prefixSum == sum)
            res = i+1;
            if(hs.containsKey(prefixSum) == false)
            hs.put(prefixSum, i);
            if(hs.containsKey(prefixSum - sum))
            res = Math.max(res,i-hs.get(prefixSum - sum));
            
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1};
        int len = arr.length;     
        System.out.println(largestZeroSubarray(arr, len));
    }
}
