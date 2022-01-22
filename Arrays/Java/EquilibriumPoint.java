class EquilibriumPoint {
    static boolean checkEquilibrium(int[] arr,int n){   //efficient O(n)

        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        sum += arr[i];
        int lsum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(lsum == sum-arr[i])
            return true;

            lsum +=arr[i];
            sum -= arr[i];
        }
        return false;

    // static boolean checkEquilibrium(int arr[], int n)
    // {
    // 	for(int i  = 0; i < n; i++)         //naive O(n^2)
    // 	{
    // 		int l_sum = 0, r_sum = 0;

    // 		for(int j = 0; j < i; j++)
    // 			l_sum += arr[j];

    // 		for(int j = i + 1; j < n; j++)
    // 			r_sum += arr[j];

    // 		if(l_sum == r_sum)
    // 			return true;
    // 	}

    // 	return false;
    // }

    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 8, -9, 20, 6}, n = arr.length;

       System.out.println(checkEquilibrium(arr, n));
    }
}
