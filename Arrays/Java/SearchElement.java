import java.util.Scanner;

class SearchElement {
    static int search(int[] arr,int ele){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele)
            return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of elements of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("enter the "+(i+1)+ " element ");
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the element to find ");
        int ele = sc.nextInt();
        sc.close();

        if(search(arr, ele) == -1)
        System.out.println("element not found ");
        else
        System.out.println("element found at "+search(arr, ele));
    }
}
