class CountingSort {
//it is not comparision based algo
//a linear time sorting algorithm for limited range elements.
//O(n+k),k can should be linear.
//to sort n elements in the range 0 to k-1

    /*static void countSort(int arr[],int n,int k){        //naive theta(n+k)
        int count[] = new int[k];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int index=0;
        for (int i = 0; i < count.length; i++) {
            for(int j=0;j<count[i];j++){
                arr[index] = i;
                index++; 
            }
        }
    //this methods cannot used for general purpose objects
    }*/

    static void countSort(int arr[],int n,int k){     
        //efficient theta(n+k)
        //stable
        // general purpose implementation
        int count[] = new int[k];
        /*for (int i = 0; i < count.length; i++) 
            count[i] = 0;*/

        for (int i = 0; i < arr.length; i++)
            count[arr[i]]++;

        for(int i=1;i<count.length;i++)
        count[i] = count[i]+count[i-1];

        int output[] = new int[n];
        //starts with n-1,because to attain stable algo
        for(int i=n-1;i>=0;i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1,4,4,1,0,1 };
        int n = arr.length; 
        int k=5;
        countSort(arr, n, k); 
   
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " ");
    }
}
