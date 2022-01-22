class BubbleSort {
    static void bubbleSort(int[] arr,int n){        //efficient < O(n^2) 
          
        boolean swapped;
        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];            //unstable sorting 
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            break;
        }
    }                     
    /*
    static void bubbleSort(int arr[], int n){         //naive O(n^2)
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if( arr[j] > arr[j + 1]){
                    
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
    }*/
    public static void main(String[] args) {
        int a[] = {2, 1, 4, 3},n = a.length;
	    bubbleSort(a, n);
	    
	    for(int i = 0; i < n; i++){
	        System.out.print(a[i] + " ");
	    }
    }
}
