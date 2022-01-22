class LeaderArray {                        //efficient theta(n)
    static void leader(int[] arr){
        int n = arr.length;
        int led = arr[n-1];
        System.out.print(led+" ");
        for(int i=n-2;i>=0;i--){
            if(arr[i] > led){
                led = arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,10,4,10,6,5,2};
        leader(arr);
    }
}
