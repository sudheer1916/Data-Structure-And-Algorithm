class MaximumSubarrayCircularSum {
    /*static int circularSum(int arr[]){             //naive method  O(n^2)
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currmax = arr[i];
            int currsum = arr[i];
            for (int j = 1; j < arr.length; j++) {
                int index = (i+j)%arr.length;
                currsum += arr[index];
                currmax = Math.max(currmax, currsum);
            }
            res = Math.max(res , currmax);
        }
        return res;
        */
    
    static int normalMaxSum(int arr[]){
        int maxending = arr[0];
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {                      //standard kadane algorithm
            maxending = Math.max(arr[i], maxending+arr[i]);
            res = Math.max(res,maxending);
        }
        return res;
    }

    static int circularSum(int arr[]){                           //efficient theta(n)
        int maxNormal = normalMaxSum(arr);
            if(maxNormal<0)
            return maxNormal;
            int arrsum = 0;                                    
            for (int i = 0; i < arr.length; i++) {              //circular sum
                arrsum += arr[i];
                arr[i] = -arr[i];
            }
            int maxCircular = arrsum + normalMaxSum(arr);
            return Math.max(maxNormal, maxCircular);
    }
    public static void main(String[] args) {
        int[] arr ={8,-4,3,-5,4};
        System.out.println(circularSum(arr));
    }
}
