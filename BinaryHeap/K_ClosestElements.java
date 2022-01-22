import java.util.Comparator;
import java.util.PriorityQueue;
class Pair{
    Integer diff;
    Integer index;
    Pair(Integer diff,Integer index){
        this.diff = diff;
        this.index = index;
    }
}
public class K_ClosestElements {    //efficient  O(nlogk)
    
    static void printKClosest(int arr[],int n,int k,int x){
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                return p2.diff.compareTo(p1.diff);
            }
        });
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(Math.abs(arr[i] - x) , i));
        }
        
        for (int i = k; i < n; i++) {
            int diff = Math.abs(arr[i] - x);
            if(pq.peek().diff > diff){
                pq.poll();
                //we are adding smallest difference to pq
                pq.add(new Pair(diff, i));  
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[pq.poll().index]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 10,30,5,40,38,80,70 };

	    int size = arr.length;

	    int x=35; int k = 3;

	    printKClosest(arr,size,k,x);
    }
}
