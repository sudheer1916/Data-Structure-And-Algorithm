import java.util.HashMap;

class CountDistinctElementsWindow {
    /*static void printDistinct(int[] arr,int n,int k){
        for (int i = 0; i <= n-k; i++) {        //naive O((n-k)*k*k) 
            int count = 0;
            for (int j = 0; j < k; j++) {
                Boolean flag = false;
                for (int l = 0; l < j; l++) {
                    if(arr[i+j] == arr[i+l]){
                        flag = true;
                        break;
                    }
                }
                if(flag == false)
                    count++;
            }
            System.out.print(count+" ");
        }
    }*/

    static void printDistinct(int arr[], int n,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < k; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        System.out.print(hm.size()+" ");        //efficient O(n)

        for (int i = k; i < arr.length; i++) {
            hm.put(arr[i-k], hm.get(arr[i-k])-1);
            
            if(hm.get(arr[i-k]) == 0)
            hm.remove(arr[i-k]);

            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
            System.out.print(hm.size()+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10, 10, 5, 3, 20, 5};
        
        int n = arr.length;
        int k=4;
        printDistinct(arr, n, k);
    }
}
