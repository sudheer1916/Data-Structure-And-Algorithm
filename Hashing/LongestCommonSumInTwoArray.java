import java.util.HashMap;
import java.util.Map;

//Longest common span with same sum in binary array
class LongestCommonSumInTwoArray {
    static int longestCommonSum(int arr1[],int arr2[]){

        // Find difference between the two 
        int n = arr1.length;
		int[] arr = new int[n]; 
		for (int i = 0; i < n; i++) 
			arr[i] = arr1[i] - arr2[i];

        // Creates an empty hashMap hM 
        Map<Integer,Integer> hm = new HashMap<>();

        int sum=0;     //Initialize sum of elements
        int maxLen=0;  //Initialize result

        //traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // To handle sum=0 at last index 
			if (sum == 0) 
            maxLen = i + 1;

            // If this sum is seen before, 
			// then update max_len if required 
			if (hm.containsKey(sum)) 
            maxLen = Math.max(maxLen, i - hm.get(sum)); 
        
            else        // Else put this sum in hash table 
            hm.put(sum, i); 
        }
        return maxLen;
    }
    public static void main(String[] args) {
        //efficient theta(n)
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1}; 
			int[] arr2 = {1, 1, 1, 1, 1, 0, 1};  
			System.out.println(longestCommonSum(arr1, arr2));
    }
}
