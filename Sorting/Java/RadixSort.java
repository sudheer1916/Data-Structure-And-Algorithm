public class RadixSort {
//supports linear time, even for larger range(like n^2 or n^3)
//uses counting sort as subroutine to sort
//not comparision based algo
//efficient  theta(d*(n+b))  d = no of digits ,b=10 
    static void countingSort(int arr[],int n,int exp){
        int count[] = new int[10];
        
        for(int i=0;i<arr.length;i++)
        count[(arr[i]/exp) % 10]++;

        for(int i=1;i<count.length;i++)
        count[i] = count[i]+count[i-1];

        int output[] = new int[n];
        for(int i = n-1;i>=0;i--){
            output[count[(arr[i]/exp) % 10]-1] = arr[i];
            count[(arr[i]/exp) % 10]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    static void radixsort(int arr[],int n){
        int mx = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>mx) {
                mx = arr[i];
            }
        }
        for(int exp=1;mx/exp>0;exp*=10)
        countingSort(arr,n,exp);
    }

    public static void main(String[] args) {
        int arr[] = { 319,212,6,8,100,50 };
        int n = arr.length; 
        radixsort(arr, n); 
   
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " ");
    }
}
