//Merge two sorted arrays
//works on divide and conquer algo
//stable algo
//T.C -> theta(n*logn) space -> O(n)
//for arrays ,quicksort performs better then mergesort
//well suited for linkedlists
public class MergeSort {
    static void merge(int a[],int b[],int m,int n){         
        int i=0,j=0;
        while (i<m && j<n) {                  //efficient theta(m+n)     
            if(a[i]<=b[j]){                     //space->O(1)
                System.out.print(a[i]+" ");
                i++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while (i<m) {
            System.out.print(a[i]+" ");
            i++;
        }
        while (j<n) {
            System.out.print(b[j]+" ");
            j++;
        }
    }
    /*static void merge(int a[], int b[], int m, int n){
    
        int[] c=new int[m+n];                  //naive O((m+n)*log(m+n))
        for(int i=0;i<m;i++)                    //space ->theta(m+n)
            c[i]=a[i];
        for(int j=0;j<n;j++)
            c[j+m]=b[j];
        
        Arrays.sort(c);
        
        for(int i=0;i<m+n;i++)
            System.out.print(c[i]+" ");
    }*/
    public static void main(String[] args) {
        int a[] = new int[]{10,15,20,40};       //sorted
        int b[] = new int[]{5,6,6,10,15};
        
        int m = a.length;
        int n = b.length;
        merge(a,b,m,n);
    }
}
