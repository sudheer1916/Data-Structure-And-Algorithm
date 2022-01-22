public class SelectionSort {
    /*
    static void selectsort(int arr[]){            //naive 
        int n = arr.length;
        int temp[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int min = 0;
            for (int j = 1; j < arr.length; j++) {  
                if(arr[j]<arr[min])
                min = j;
            }   
            temp[i] = arr[min];
            arr[min] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }*/
    //in selection sort,the algo works in same T.C
    //i.e best and worst case T.C are same
    static void selectsort(int arr[]){
        //int n = arr.length;
        for (int i = 0; i < arr.length-1; i++) {        //unstable sorting
            int min = i;                                //theta(n^2)
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min])
                min = j;
            }
            //swapping
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,8,20,2,18};
        selectsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
