public class InsertInBinaryHeap {
    static class MinHeap{
        int arr[];
        int capacity;
        int size;
        MinHeap(int cap){
            capacity = cap;
            //size = 0;
            arr = new int[cap];
        }
        int left(int i){
            return (2*i+1);
        }
        int right(int i){
            return (2*i+2);
        }
        int parent(int i){
            return ((i-1)/2);
        }
        public void insert(int x){      //O(log(size))
            if(size == capacity)
            return ;
            size++;
            arr[size-1] = x;

            for(int i=size-1;i!=0 && arr[parent(i)]>arr[i]; ){
                //swapping arr[i] with parent of arr
                int temp = arr[i];
                arr[i] = arr[parent(i)];
                arr[parent(i)] = temp;
                i = parent(i);
            }
        }
    }
    
    public static void main(String[] args) {
        MinHeap h = new MinHeap(11);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);
    }
}
