class CountInversions {
     
    /*static int countInversions(int arr[]){                  //naive O(n^2)
        int res=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i])
                res++;
            }
        }
        return res;
    }*/

    static int countAndMerge(int arr[],int l,int mid,int r){            
        int n1 = (mid-l)+1, n2 = r-mid;                     //efficient O(n*log n)
        int left[] = new int[n1];                           //using mergesort
        int right[] = new int[n2];

        for (int i = 0; i < left.length; i++)
            left[i] = arr[i+l];
        for (int i = 0; i < right.length; i++)
            right[i] = arr[(mid+1)+i];

        int res=0,i=0,j=0,k=l;
        while (i<n1 && j<n2) {
            if(left[i]<=right[j])
            arr[k++] = left[i++];
            else{
                arr[k++] = right[j++];
                res = res + (n1-i);         //main step 
            }
            
        }
        while (i<n1) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j<n2) {
            arr[k] = right[j];
            k++;
            j++;
        }
        return res;
    }

    static int countInv(int arr[],int l,int r){
        int res=0;
        if(l<r){
            int mid = (r+l)/2;
            res += countInv(arr, l, mid);
            res += countInv(arr, mid +1, r);
            res += countAndMerge(arr,l,mid,r);
        }
        return res;
    } 

    public static void main(String[] args) {
        int arr[] = new int[]{2,4,1,3,5};
        
        int n = arr.length;
	    //System.out.print(countInversions(arr));
        System.out.print(countInv(arr,0,n-1));
    }
}
