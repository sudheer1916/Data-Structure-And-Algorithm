//implementation of Binary Heap using MinHeap

class MinHeap{
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
    
    /*public static void main(String[] args) {
        MinHeap h = new MinHeap(11);
        System.out.println(h);
    }*/
}
