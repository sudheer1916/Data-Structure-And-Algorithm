/*class RotateLeftArray {                              
    static void rotate(int[] arr){      //naive   O(nd)
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {35,8,26,25,15,4};
        int d=2;
        for (int i = 0; i < d; i++) {
            rotate(arr);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}*/
class RotateLeftArray{
    static void reverse(int arr[],int low,int high){
        while (low<high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    //reversal Algorithm   efficient    theta(n) 
    static void rotate(int arr[],int n,int d){      
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {4,65,8,15,45,75,3,5};
        int n = arr.length;
        int d=3;
        rotate(arr, n, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
