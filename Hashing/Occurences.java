import java.util.HashMap;
import java.util.Map;

//import java.util.Arrays;

//More than n/k Occurences 
class Occurences {
    /*static void printNByK(int arr[],int n,int k){
        Arrays.sort(arr);           //naive O(n*logn)
        int i=1,count = 1;
        while (i<n) {
            while (i<n && arr[i] == arr[i-1]) {
                count++;
                i++;
            }
            if(count > n/k)
            System.out.print(arr[i]+" ");

            count=1;
            i++;
        }
    }*/

    static void printNByK(int arr[],int n,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int x : arr) {                 //efficient theta(n)
            hm.put(x, hm.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue() > n/k)
            System.out.print(e.getKey()+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10, 10, 20, 30, 20, 10,10};
        
        int n = arr.length;
        int k=2;
        printNByK(arr, n, k);
    }
}
