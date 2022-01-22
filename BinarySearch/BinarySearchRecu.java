class BinarySearchRecu {

    static int bsearch(int[] arr,int low,int high,int x){
        if(low > high)
			return -1;

        int mid = (low + high)/2;
        if(arr[mid] == x)
        return mid;
        else if(x < arr[mid])
        return bsearch(arr, low, mid-1, x);
        else
        return bsearch(arr, mid+1, high, x);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70}, n = 7;

		int x = 20;

        System.out.println(bsearch(arr, 0, n - 1, x));
    }
}

//T.C O(log n) for successful search
//T.C theta(log n) for unsuccessful search 