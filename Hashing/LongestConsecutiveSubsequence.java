import java.util.*;
//in this prblm there are always 2n lookups atmost, where n = no of elements
class LongestConsecutiveSubsequence {           //efficient theta(n)
    static int findLongest(int[] arr,int n){
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            if(h.contains(arr[i]-1) == false){
                int curr = 1;
                while(h.contains(arr[i]+1))
                curr++;

                res = Math.max(res, curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 9, 3, 4, 2, 10, 13};   
        int n = arr.length;
        System.out.println(findLongest(arr, n ));
    }    
}
