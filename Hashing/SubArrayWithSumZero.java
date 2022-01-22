import java.util.HashSet;
import java.util.Set;

class SubArrayWithSumZero {   //efficient O(n)
    static boolean zeroSumSubarray(int[] arr,int n){
        Set<Integer> s = new HashSet<>();
        int prefixSum = 0;
        //s.add(0);
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if(s.contains(prefixSum) == true)
            return true;
            if(prefixSum == 0)
            return true;
            s.add(prefixSum);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{5, 3, 9, -4, -6, 7, -1};
        int n = arr.length;
        
        System.out.println(zeroSumSubarray(arr, n));
    }
}
