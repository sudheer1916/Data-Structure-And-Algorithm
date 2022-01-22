import java.util.Arrays;

class LongestConsecutiveSubsequence {
    static int findLongest(int arr[],int n){
        Arrays.sort(arr);
        int res=1,curr=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]+1){
                curr++;
                res = Math.max(res, curr);
            }
            else
            curr=1;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 9, 3, 4, 10, 5, 6, 13, 7};
        int n = arr.length;        
        System.out.println(findLongest(arr, n ));
    }
}
