//given a random array, rearrange its elements to form a minHeap
//Maximum number of nodes at height h = ceil[n/(2^(h+1))]
public class BuildHeap {
    public static class MinHeap{
        int arr[];
        int size;
        int capacity;
        
        MinHeap(int c){
        size = 0; 
        capacity = c; 
        arr = new int[c];
        }
    
        int left(int i) { return (2*i + 1); } 
        int right(int i) { return (2*i + 2); } 
        int parent(int i) { return (i-1)/2; } 
    
    public void minHeapify(int i) 
    { 
        int lt = left(i); 
        int rt = right(i); 
        int smallest = i; 
        if (lt < size && arr[lt] < arr[i]) 
        smallest = lt; 
        if (rt < size && arr[rt] < arr[smallest]) 
        smallest = rt; 
        if (smallest != i) 
        { 
            int temp = arr[i]; 
            arr[i] = arr[smallest]; 
            arr[smallest] = temp; 
            minHeapify(smallest); 
        } 
    }
    void buildHeap(int arr[]){           //O(n)
        for(int i = (size-2)/2;i>=0;i--)
        minHeapify(i);
    }
    }
    public static void main(String[] args) {
        //MinHeap h = new MinHeap(11);
        /*int arr1[] = {10,5,20,2,4,8};
        h.buildHeap(arr1);
        for (int i : arr1) {
            System.out.print(i+" ");        //2 4 8 5 10 20
        }*/
    }

}
