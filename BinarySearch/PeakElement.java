class PeakElement {

    static int getPeak(int arr[],int n){                           //efficient O(log n)
        int low = 0,high = n -1;
        while (low<=high) {
            int mid = (low + high)/2;
            if((mid == 0 || arr[mid]>arr[mid-1]) && (mid == n-1 || arr[mid]>arr[mid + 1]))
            return arr[mid];
            if(mid>0 && arr[mid-1]>arr[mid])
            high = mid -1;
            else
            low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 20, 40, 30, 20, 50, 60}, n = arr.length;
        System.out.println(getPeak(arr, n));
    }
}
/*
class GFG 
{ 

	static int getPeak(int arr[], int n)                 //naive O(n)
	{
		if(n == 1)
			return arr[0];
		if(arr[0] >= arr[1])
			return arr[0];
		if(arr[n - 1] >= arr[n - 2])
			return arr[n - 1];

		for(int i = 1; i < n - 1; i++)
			if(arr[i] >= arr[i - 1] && arr[i] <= arr[i + 1])
				return arr[i];
				
		return -1;
	}

	public static void main(String args[]) 
    {

		int arr[] = {10, 7, 8, 20, 12}, n = 5;

        System.out.println(getPeak(arr, n));

    } 
}*/
