class BinarySeach{

    static int bsearch(int[] arr,int x){                 //iterative B.S is much better than recursive B.S because code will take
        int high = arr.length;                           //O(log n) extra auxillary space.
        int low = 0;
        
        while (low<=high) {
            int mid = (high+low)/2;
            if(arr[mid] == x)
            return mid;
            else if(x<arr[mid])
            high = mid-1;
            else
            low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};

		int x = 20;
    
        System.out.println(bsearch(arr,x));
    }
}