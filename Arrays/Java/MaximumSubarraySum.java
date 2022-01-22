class MaximumSubarraySum {
    static int maxSum(int arr[]){                         //naive O(n^2)
        
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {            
            int count =0 ;
            for (int j = i; j < arr.length; j++) {
                count = count + arr[j];
                res = Math.max(res, count);
            }
        }
        return res;
    }
    static int maxSum1(int arr[]){                      //efficient O(n)      Kadane's algorithm.
        int maxending = arr[0];
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxending = Math.max(maxending+arr[i], arr[i]);
            res = Math.max(res, maxending);
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-1,2};
        int[] arr1 = {-1};
        //int[] arr = {2,5,6,3};          //result->total sum of the array
        //int[] arr = {-1,-2,-5};         //result->maximum of the array elements
        System.out.println(maxSum(arr));
        System.out.println(maxSum1(arr1));
    }    
}
