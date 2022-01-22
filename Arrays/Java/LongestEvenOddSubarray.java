class LongestEvenOddSubarray {
    static int maxlen(int arr[]){       //naive     //O(n^2)
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            int curr = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]%2 == 0 && arr[j-1]%2 != 0  || 
                   arr[j]%2 != 0 && arr[j-1]%2 == 0)
                   curr++;
                else
                break;
            }
            res = Math.max(res, curr);
        }
        return res;
    }
    // static int maxlen(int[] arr){                    //based on Kadane's algorithm   T.C = O(n)
    //     int count = 1;
    //     int res = 1;
    //     for (int i = 1; i < arr.length; i++) {
    //         if((arr[i]%2==0 & arr[i-1]%2!=0) || (arr[i]%2!=0 & arr[i-1]%2==0)){
    //             count++;
    //             res = Math.max(res, count);
    //         }else count=1;
    //     }
    //     return res;
    // }
    public static void main(String[] args) {
        int[] arr = {10,12,14,7,8};
        //int[] arr = {7,10,13,14};
        //int[] arr = {10,12,14,8};
        System.out.println(maxlen(arr));
    }
}
