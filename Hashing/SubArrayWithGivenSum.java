import java.util.HashSet;
import java.util.Set;

/*This problem is an extension of the previously discussed 
problem of creating a subarray with zero-sum.
This problem discusses the creation of similar subarray with a 
given input sum.*/

class SubArrayWithGivenSum {            //efficient O(n)
    static boolean isSum(int[] arr,int n,int sum){
        Set<Integer> s = new HashSet<>();
        int preSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(preSum == sum)
            return true;
            preSum += sum;
            if(s.contains(preSum-sum)==true)
            return true;

            s.add(preSum);
        }
        return false;
    }
    /*static boolean isSum(int arr[], int n, int sum)     //naive
    {
        for(int i=0;i<n;i++){
            int curr_sum=0;
            for(int j=i;j<n;j++){
               curr_sum+=arr[j];
               if(curr_sum==sum)
                    return true;
            }
        }
        return false;
    }*/

    public static void main(String[] args) {
        int arr[] = new int[]{5, 8, 6, 13, 3, -1};
        int sum=22;
        int n = arr.length;
        
        System.out.println(isSum(arr, n, sum));
    }
}
