public class MinAdjacentDiffInCirArray {
    static int minAdjDiff(int arr[], int n){
        int diff = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            diff = arr[i] - arr[i-1];
            res = Math.min(res, Math.abs(diff));
        }
        if(Math.abs(arr[arr.length-1] - arr[0]) < res)
        return Math.abs(arr[arr.length-1] - arr[0]);
        else
        return res;
        
    }
    public static void main(String[] args) {
        
    }
}
