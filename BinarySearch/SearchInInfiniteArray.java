class SearchInInfiniteArray {
    //called as unbounded binary search      O(log pos)     //efficient

    static int bSearch(int arr[], int low, int high, int x)
		{
			if(low > high)
				return -1;

			int mid = (low + high) / 2;

			if(arr[mid] == x)
				return mid;

			else if(arr[mid] > x)
				return bSearch(arr, low, mid - 1, x);

			else
				return bSearch(arr, mid + 1, high, x);
		}

    static int search(int arr[],int x){
        if(arr[0] == x) return 0;
        int i=1;
        while (i<x)
        i = i * 2;

        if(arr[i] == x) return i;

        return bSearch(arr,i/2+1,i-1,x);

    }

    /*static int search(int arr[], int x)          //naive	  O(pos)
	{
		int i = 0;

		while(true)
		{
			if(arr[i] == x) return i;

			if(arr[i] > x) return -1;

			i++;
		}
	}*/

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 40, 50};

		int x = 3;

        System.out.println(search(arr, x));
    }
}
