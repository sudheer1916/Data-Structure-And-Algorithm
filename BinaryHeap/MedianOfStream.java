import java.util.Collections;
import java.util.PriorityQueue;

//import java.util.Arrays;
class Node{
    double data;
    Node left,right;
    int lcount;
    Node(double x){
        data = x;
        left = right = null;
        lcount = 0;
    }
}
public class MedianOfStream {
    static void printMedians(int arr[],int n){      //efficient  O(nlogn)
        PriorityQueue<Integer> g = new PriorityQueue<>();  //minHeap
        PriorityQueue<Integer> s = new PriorityQueue<>(
                            Collections.reverseOrder());    //maxHeap
        s.add(arr[0]);
        System.out.print(arr[0]+" ");
        for(int i=1;i<arr.length;i++){
            int x = arr[i];
            if(s.size() > g.size()){
                if(s.peek() > x){
                    g.add(s.poll());
                    s.add(x);
                }
                else
                    g.add(x);
                System.out.print( ((double)(s.peek()+g.peek())/2)+" " );
            }
            else{
                if(x <= s.peek())
                    s.add(x);
                else{
                    g.add(x);
                    s.add(g.poll());
                }
                System.out.print(s.peek()+" ");
            }
        }   
    }
    public static void main(String[] args) {
        int keys[] = {12,15,10,5,8,7,16};
        printMedians(keys, keys.length);
    }
}
/*public static void main(String[] args) {    //naive  O(n^2)
        double[] arr = new double[]{25,7,10,15,20};
        double[] temp = new double[arr.length];
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
            size++;
            //Arrays.sort(temp);
            int j = i;
            while (j>0 && temp[j]<temp[j-1]) {
                double a = temp[j];
                temp[j] = temp[j-1];
                temp[j-1] = a;
                j--;
            }
            if(size%2!=0)
            System.out.print(temp[size/2]+" ");
            else
            System.out.print(((temp[size/2]+temp[(size-1)/2])/2)+" ");
        }
    }*/