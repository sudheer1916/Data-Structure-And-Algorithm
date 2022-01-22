class SearchInRotatedArray {

    static int search(int arr[],int x){             //efficient O(log n)
        int low = 0, high = arr.length;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == x) return mid;

            if(arr[low]<arr[mid]){
                if(arr[low]<=x && x<arr[mid])
                high = mid - 1;
                else
                low = mid +1;            
            }
            else{
                if(arr[mid]<x && x<=arr[high])
                low = mid+1;
                else
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,40,60,5,8};
        int x = 6;
        System.out.println(search(arr,x));
    }
}
