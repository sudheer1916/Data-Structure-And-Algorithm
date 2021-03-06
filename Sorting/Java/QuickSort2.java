public class QuickSort2 {
    static int partition2(int arr[],int l,int h){
        int pivot = arr[l];
        int i=l-1;
        int j=h+1;
        while (true) {
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(j<=i) return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static void qSort(int arr[],int l,int h){
        if(l<h){
            int p = partition2(arr,l,h);
            qSort(arr, l, p);
            qSort(arr, p+1, h);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{8,4,7,9,3,10,5};
        
        int n = arr.length;
        qSort(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
    }
}
