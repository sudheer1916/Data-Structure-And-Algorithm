import java.util.Scanner;
//T.C = O(1) -> if we insert at end ,theta(n) -> insert at beginning
class InsertElement {
    static int insert(int[] a,int n,int x,int cap,int pos){
        if(n==cap)
        return n;
        int idx = pos-1;
        for (int i = n-1; i>=idx; i--) {
            a[i+1] = a[i];
        }
        a[idx] = x;
        return n+1;
    }
    public static void main(String[] args) {
        int x,pos,cap,n;
        //int cap=5;
        //int n=4;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the capacity of an array ");
        cap = sc.nextInt();
        System.out.println("enter no of elements before insertion ");
        n=sc.nextInt();

        int arr[] = new int[cap];
        for(int i=0;i<n;i++){
            System.out.print("enter the "+(i+1)+ " element ");
            arr[i] = sc.nextInt();
        }
        /*arr[0]=45;
        arr[1]=4;
        arr[2]=5;
        arr[3]=23;*/

        System.out.println("Before Insertion");

        for(int i=0; i < n; i++)
        {
       		System.out.print(arr[i]+" ");
        }

        System.out.println();

        
        System.out.println("enter the element to insert ");
        x = sc.nextInt();
        System.out.println("enter the position ");
        pos = sc.nextInt();
        
        n=insert(arr,n,x,cap,pos);

        System.out.println("After Insertion");
        for(int i = 0;i<= n-1;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
