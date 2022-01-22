//import java.util.Arrays;

public class Union {
    
    /*static void union(int a[],int b[]){      //naive theta((m+n)*log(n+m))
        int c[] = new int[a.length+b.length];
    
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i+a.length] = b[i];
        }

        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            if(i==0 || c[i]!=c[i-1])
            System.out.print(c[i]+" ");
        }
    }*/
    
    static void union(int a[],int b[]){    //efficient theta(m+n)
        int m = a.length;
        int n = b.length;
        int i=0,j=0;
        while (i<m && j<n) {
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if (j>0 && b[j]==b[j-1]) {
                j++;
                continue;
            }
            if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else if(a[i]>b[j]){
                System.out.print(b[j]+" ");
                j++;
            }
            else{
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        while (i<m) {
            if(i>0 && a[i]!=a[i-1]){
                System.out.print(a[i]+" ");
                i++;
            }
        }
        while (j<n) {
            if(j>0 && b[j]!=b[j-1]){
                System.out.print(b[j]+" ");
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{3,8,10};
        int b[] = new int[]{2,8,9,10,15};
        union(a,b);
    }
}
