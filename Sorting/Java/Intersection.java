public class Intersection {
    /*static void intersection(int a[],int b[]){   //naive
        for (int i = 0; i < a.length; i++) {
            if(i>0 && a[i]==a[i-1])
                continue;
            for (int j = 0; j < b.length; j++) {
                if(b[j] == a[i]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
    }*/

    static void intersection(int a[],int b[]){
        int i=0,j=0;
        while (i<a.length && j<b.length) {
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }

            if(a[i]<b[j])
            i++;
            else if(a[i]>b[j])
            j++;
            else{
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};

        intersection(a,b);
    }
}
