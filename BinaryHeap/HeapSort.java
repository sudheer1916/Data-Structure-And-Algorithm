//step 1 : build a maxheap 
//step 2 : repeatedly swap root with last node,reduce heap size by 1 and heapify
// if we want to sort in increasing order, we use maxHeap Or
// if we want to sort in decreasing order, we use MinHeap
/*heapSort is an improvement of selection sort because selection sort 
T.C = O(n^2) where as heapSort is O(nlogn)*/
//heapSort is used as helper sorting Algo in hybrid algorithms
public class HeapSort {
    void heapify(int arr[],int n,int i){        //max heapify
        int largest = i;
        int lt = 2*i+1;
        int rt = 2*i+2;
        if(lt<n && arr[lt]>arr[largest])
        largest = lt;
        if(rt<n && arr[rt] > arr[largest])
        largest = rt;

        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    void buildHeap(int arr[],int n){
        for(int i = n/2-1;i >=0;i--)
        heapify(arr,n,i);       
    }
    void sort(int arr[]){
        int n = arr.length;
        buildHeap(arr, n);
        for(int i = n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7}; 
		//int n = arr.length; 

		HeapSort ob = new HeapSort(); 
		ob.sort(arr); 

		System.out.println("Sorted array is"); 
		printArray(arr);
    }
}
