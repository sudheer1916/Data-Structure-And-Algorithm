import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithGivenSum {
    static int largestSubarrayWithSumX(int arr[],int n,int sum){
        Map<Integer,Integer> hs = new HashMap<>();
        int prefixSum = 0,res =0;           //efficient theta(n)
        //hs.add(0);
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
        //int arr[] = new int[]{8, 3, -7, -4, 1};
        int arr[] = {5,2,3};
        int n = arr.length;
        //int sum = -8;
        int sum=5;
        System.out.println(largestSubarrayWithSumX(arr, n, sum));
    }
}
