class WIndowSlidingTechnique {
    //Maximum Sum of K Consecutive elements(Efficient)              O(n)

    static int fun(int arr[],int k){
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        int maxSum = currSum;
        for (int i = k; i < arr.length; i++) {
            currSum = currSum + arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,30,-5,20,7},k=3;
        System.out.println(fun(arr,k));
    }
}
