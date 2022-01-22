class MaxOccuringElement {
    static int maxOcc(int[] L, int[] R, int n){
    int arr[] = new int[1000];
    for (int i = 0; i < n; i++) {
        arr[L[i]]++;
        arr[R[i]+1]--;
    }
    int max = arr[0],res = 0;
    for (int i = 1; i < 1000; i++) {
        arr[i] = arr[i]+arr[i-1];
        if(arr[i]>max){
            max = arr[i];
            res = i;
        }
    }
    return res;
}
    public static void main(String[] args) {
        int L[] = {1, 2, 3}, R[] = {2, 5, 7}, n = 3;           //this method is optimisable upto 1000 elements

        System.out.println(maxOcc(L, R, n));
    }
}
