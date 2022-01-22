class LargestElementInArray {
    static int getLargest(int arr[]){
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[res])
            res = i;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5,16,10,4,1};
        int lar = getLargest(arr);
        System.out.println("largest element = "+ arr[lar]);
    }
}
