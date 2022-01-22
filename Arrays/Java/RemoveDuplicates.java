public class RemoveDuplicates {
    static int duplicates(int arr[]){
        int org = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[org]){
                org++;
                arr[org] = arr[i];
            }
        }
        return org;
    }
    
    public static void main(String[] args) {
        int arr[] = {10,10,20,20,30,30,30};     //array should be sorted
	    System.out.println("before Removal ");
	    for(int i = 0; i < arr.length; i++)
        {
       		System.out.print(arr[i]+" ");
        }
        System.out.println();
	    int n = duplicates(arr);
	
        System.out.println("After Removal ");
	    for(int i = 0; i <= n; i++)
        {
       		System.out.print(arr[i]+" ");
        }
    }
}
