public class ReverseTheArray {
    static void reverse(int arr[]){     //efficient   theta(n)
        int low = 0, high = arr.length-1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,78,50},n=6;
        System.out.println("Before Reverse");
	    for(int i = 0; i < n; i++)
        {
       		System.out.print(arr[i]+" ");
        }

	    reverse(arr);
	
        System.out.println("After Reverse");
        for(int i = 0; i < n; i++)
        {
       		System.out.print(arr[i]+" ");
        }
    }
}
