import java.util.Arrays;

class MinimumDiffenceInArray {

    static int getDiff(int arr[]){            //efficient O(n*logn) 
        Arrays.sort(arr);

        int res = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            res = Math.min(res , arr[i]-arr[i-1]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {10,8,4,1};
        System.out.println(getDiff(arr));
    }
}
