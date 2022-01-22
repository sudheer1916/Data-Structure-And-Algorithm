//import java.util.Arrays;
class KthSmallestElement{
    /*static int kthSmallestElement(int arr[],int k){
        Arrays.sort(arr);
        return arr[k-1];                    //n*logn   naive
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,5,30,12},k=2;
        System.out.print(kthSmallestElement(arr,k));
    }*/

    //this method is called 
    //O(n^2) -> worstcase but on average case works in linear time
    //also called as QUICK SELECT algo
    
    static int partition(int arr[],int low,int high){         //lomuto 
        int pivot = arr[high];
        int i=low-1;
        for (int j = low; j < arr.length-1; j++) {
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    
    static int kthSmallest(int arr[],int n, int k){
        int l = 0,r = n-1;
        while (l<=r) {
            int p = partition(arr,l,r);
            if(p==k-1)
            return p;
            else if(p>k-1)
            r = p-1;
            else
            l = p+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,4,5,8,11,6,26};
        
        int n = arr.length;int k=5;
        int index=kthSmallest(arr,n,k);
        
        System.out.print(arr[index]);
        
    }
}