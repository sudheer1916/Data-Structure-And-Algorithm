class DeleteElement {
    static int delete(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]  == x) {
                arr[i] = arr[i+1];
            }
        }
        return arr.length-1;
        
    }
    public static void main(String[] args) {
        int arr[] = {5,6,2,3,14,85};
        int x = 2;
        
        System.out.println("before deletion ");
       for(int i=0; i < arr.length; i++)
       {
            System.out.print(arr[i]+" ");
       }

        int n = delete(arr,x);

        System.out.println("After deletion ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
    }    
}
