class ArrayWith2TypesOfElements {
//Segregate negative and positive elements.
//Segregate even and odd elements.
//Sort a binary array.

    /*static void sort(int arr[],int n){          //naive method theta(n)
        int temp[] = new int[n];                  //three traversal
        int i=0;

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]<0)
            temp[i++] = arr[j];
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>=0)
            temp[i++] = arr[j];
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = temp[j];
        }
    }*/

    static void sort(int arr[],int n){             //efficient theta(n)
        int i=-1,j=n;                              //single traversal
        while (true) {                             //based on hoare algo
            do {
                i++;
            } while (arr[i]<0);
            do {
                j--;
            } while (arr[j]>=0);
            if(i>=j) return;

            //swap(arr[i],arr[j]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{13,-12,18,-10};
        
        int n = arr.length;
        
        sort(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
    }    
}
