class SubsetSum {
    static int fun(int[] arr,int n,int sum){
        if(n==0) 
        return sum==0 ? 1:0;

        return fun(arr, n-1, sum) + fun(arr, n-1, sum - arr[n-1]);
    } 
    //Theta(2^n)
    public static void main(String[] args) {
        int arr[] = {4,6,3};
        int sum = 10;
        int n = arr.length;
        System.out.println(fun(arr,n,sum));
    }    
}
