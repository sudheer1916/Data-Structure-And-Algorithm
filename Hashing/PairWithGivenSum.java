import java.util.HashSet;

public class PairWithGivenSum {    //efficient

    static int pairWithSumX(int[] arr,int n,int sum){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(hs.contains(sum - arr[i])){
                System.out.println(arr[i]+"+"+(sum - arr[i]));
                return 1;
            }
            

            hs.add(arr[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int len = arr.length;
        int x = 14;
        System.out.println(pairWithSumX(arr, len, x));
    }
}
