class ArrayWith3TypesOfElements {
    //to segregate an array of elements containing three types of elements
    //Sort an array of 0s, 1s, 2s.
    //Three-way partitioning when multiple occurrences of a pivot may exist.
    //Partitioning around a range.

    /*static void sort(int arr[],int n){              //naive theta(n)
        int temp[] = new int[n];
        int i = 0;
        for(int j=0;j<n;j++)
            if(arr[j]==0)
                temp[i++]=arr[j];
        for(int j=0;j<n;j++)
            if(arr[j]==1)
                temp[i++]=arr[j];
        for(int k=0;k<n;k++)
            if(arr[k]==2)
                temp[i++]=arr[k];
        for(int j=0;j<n;j++)
            arr[j]=temp[j];
    }*/

    //also called "Dutch National Flag Algorithm"
    static void sort(int arr[],int n){          //efficient theta(n)
        int l = 0,h = n-1,mid=0;                //single traversal
        while (mid<=h) {
            switch (arr[mid]) {
                case 0:
                    //swap arr[l]&arr[mid]
                    int temp = arr[l];
                    arr[l] = arr[mid];
                    arr[mid] = temp;

                    l++;mid++;
                    break;
                
                case 1:
                    mid++;
                    break;

                case 2:
                    //swap arr[l]&arr[mid]
                    temp = arr[h];
                    arr[h] = arr[mid];
                    arr[mid] = temp;
                    h--;
                    break;
            
                default:
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{0,1,1,2,0,1,1,2};
        
        int n = arr.length;
        
        sort(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
    }
}
