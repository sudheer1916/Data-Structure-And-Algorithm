import java.util.TreeSet;

//Ceiling on left side in an array

public class CeilingOnLeftInArray {
    /*static void printCeiling(int[] arr, int n){     //naive  O(n^2)
        System.out.print(-1+" ");
        for (int i = 1; i < arr.length; i++) {
            int ceil = Integer.MAX_VALUE;
            for (int j = i-1; j >= 0; j--) {
                if(arr[j] >= arr[i]){
                    ceil = Math.min(ceil, arr[j]);
                    return ;
                }
            }
            if(ceil == Integer.MAX_VALUE)
            System.out.print(-1+" ");
            else
            System.out.print(ceil+" ");
        }
    }*/
    static void printCeiling(int[] arr, int n){
        System.out.print(-1+" ");
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(ts.ceiling(arr[i])!=null)
            System.out.print(ts.ceiling(arr[i])+" ");
            else
            System.out.print(-1+" ");

            ts.add(arr[i]);
        }
    }
    public static void main(String args[]) 
    { 
        int arr[]={2,8,30,15,25,12};
	    int n=arr.length;
	
	    printCeiling(arr,n);
    }
}
