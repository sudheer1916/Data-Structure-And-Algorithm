public class MergeFunction {
    static void merge(int arr[],int l,int mid,int h){
        //theta(n);
        int l1 = mid+1;
        int left[] = new int[l1];
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        int l2 = arr.length - left.length;
        int right[] = new int[l2];
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[i+(mid+1)];
        }

        int i=0,j=0,k=0;
        while (i<l1 && j<l2) {
            if(left[i]<=right[j]){
                arr[k] = left[i];
                k++;
                i++;
            }
            else{
                arr[k] = right[j];
                k++;
                j++; 
            }
        }
        while(i<l1){
            arr[k] = left[i];
            i++;
        }
        while(j<l2){
            arr[k] = right[j];
            j++;
        }
    }
    public static void main(String[] args) {
        int a[] = new int[]{10,15,20,40,8,11,15,22,25};
	    int l=0,h=8,m=3;
        //m = mid, such that low to mid are sorted and mid to high are sorted

        merge(a,l,m,h);

	    for(int x: a)
	        System.out.print(x+" ");
    }
}
