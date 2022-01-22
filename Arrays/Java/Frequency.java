class Frequency {
    
    static void frequency(int arr[]){
        int n = arr.length;
        int freq = 1,i=1;
        while (i<n) {                                   //theta(n)   efficient
            while (i<n && arr[i]==arr[i-1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + "--->" + freq);
            i++;
    		freq = 1;
        }
        if(n==1 || arr[n-1]!=arr[n-2])
        System.out.println(arr[n-1]+"--->"+1);
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10,10,10,20,20,30};            //works for sorted
        int arr1[] = {10,10,10};
        int arr2[] = {20};
        frequency(arr);
        frequency(arr1);
        frequency(arr2);
    }    
}
