/*import java.util.Set;
import java.util.HashSet;*/
import java.util.*;

class CountDistinctElements {           //efficient theta(n)
    static int count(int[] arr,int n){
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        return hs.size();
    } 
    public static void main(String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;

        System.out.println(count(arr,n));
    }
}
