public class HeapifyAndExtract {
    static class MinHeap{
        int arr[];
        int capacity;
        int size;
        MinHeap(int cap){
            capacity = cap;
            arr = new int[cap];
        }
        int left(int i) {return 2*i+1; }
        int right(int i) {return 2*i+2; }
        int parent(int i){return (i-1)/2; }

        void insert(int x){
            if(size == capacity) return ;
            size++;
            arr[size-1] = x;

            for(int i = size-1; i!=0 && arr[parent(i)] > arr[i];)
            {
                int temp = arr[i];
                arr[i] = arr[parent(i)];
                arr[parent(i)] = temp;

                i = parent(i);
            }
        }

        void minHeapify(int i){     //recursive //O(h) or h = logn (for minHeap)
            int lt = left(i);       //A.s = O(logn)
            int rt = right(i);
            int smallest = i;
            //lt<size to check whether the node contains left or not
            if(lt < size && arr[lt] < arr[i])    
            smallest = lt;
            if(rt < size && arr[rt] < arr[smallest])
            smallest = rt;
            if(smallest != i){
                //swap arr[i] and arr[smallest]
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
                minHeapify(smallest);
            }
        }

        int extractMin(){
            if(size == 0)
            return Integer.MAX_VALUE;
            if(size == 1){
                size--;
                return arr[0];
            }
            int temp = arr[0];      //minimum element
            arr[0] = arr[size-1];
            arr[size-1] = temp;
            size--;
            minHeapify(0);

            return arr[size];   //removed element
        }
    }
    public static void main(String[] args) {
        MinHeap h = new MinHeap(11);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);
        System.out.print(h.extractMin());
    }
}
