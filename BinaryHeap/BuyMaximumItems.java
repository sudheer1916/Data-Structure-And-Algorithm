//import java.util.Arrays;
import java.util.PriorityQueue;

//the problem of buying the maximum items with a given sum.
public class BuyMaximumItems {
    /*public static void main(String[] args) {     //method1  sorting
        //int n=5;                                 //O(nlogn)
        int cost[] = new int[]{1,12,5,111,200};
        int sum = 10;

        int res = 0;
        Arrays.sort(cost);
        for (int i = 0; i < cost.length; i++) {
            if(cost[i] <= sum){
                sum -= sum;
                res++;
            }else{
                break;
            }
        }
        System.out.println(res);
    }*/
    public static void main(String[] args){     //method2 using heap
        int cost[]=new int[]{1,12,5,111,200};   //O(n)+O(res*logn)
        int sum=10;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int res = 0;
        for (int i = 0; i < cost.length; i++) {
            pq.add(cost[i]);
        }
        for (int i = 0; i < cost.length; i++) {
            if(pq.peek()<=sum){
                sum-=pq.poll();
                res++;
            }else{
                break;
            }
        }
        System.out.println(res);
    }
}
