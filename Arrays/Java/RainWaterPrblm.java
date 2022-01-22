class RainWaterPrblm {

    static int rainwater(int arr[]){            //theta(n^2)    //naive
        int res = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int lmax = arr[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                rmax = Math.max(rmax, arr[j]);
            }
            res = res + (Math.min(lmax, rmax) - arr[i]); 
        }
        return res;
    }
    
    // //pre computed lmax and rmax
    // static int rainwater(int arr[]){         //theta(n)   //efficient
    //     int res = 0;
    //     int n = arr.length;
    //     int lmax[] = new int[n];
    // 	int rmax[] = new int[n];
    //     lmax[0] = arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         lmax[i] = Math.max(arr[i], lmax[i-1]); 
    //     }
        
    //     rmax[n-1] = arr[n-1];
    //     for (int i = n-2; i >= 0; i--) {
            
    //         rmax[i] = Math.max(arr[i], rmax[i+1]);
    //     }
    //     for (int j = 1; j < arr.length; j++) {
    //         res = res + Math.min(lmax[j], rmax[j])-arr[j];
    //     }
    //     return res;
        
    // }
    public static void main(String[] args) {
        int[] arr = {5,0,6,2,3};
        int t = rainwater(arr);
        System.out.print(t);
    }
}
