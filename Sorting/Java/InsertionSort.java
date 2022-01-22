//worstcase(when array is reverse Order)->O(n^2), bestcase(sorted)->O(n)
//in-place and stable algorithm
//used for small sized arrays
//used in these hybrid algorithm like Timsort and introsort
//Timsort(used in python lybriaries)->mergesort + insertion sort
//introsort->heapsort+quicksort+insertion sort


class InsertionSort {
    static void iSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int key = arr[i];
            while (j>=0 && arr[j]>key) {    //if arr[j]>=key then algo will be instable
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{50,20,40,60,10,30};
        iSort(arr);
        for(int i:arr)
        System.out.print(i+" ");
    }
}
