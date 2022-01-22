class Partition1 {
    //Lomuto Partition - another method of partitioning
    //O(n) traverses only once
    //not stable 
    //last element as pivoted element
    static int iPartition(int arr[],int l,int h){
        int pivot = arr[h];
        int i = l-1;
        for (int j = l; j < arr.length-1; j++) {
            if(arr[j]<pivot){
                i++;
                //swap(arr[i],arr[j]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap(arr[i+1], arr[h]);
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{10,80,30,90,40,50,70};
        
        int n = arr.length;
        int m = iPartition(arr,0,n-1);
        System.out.println(m);              //Partition index 
        
	    for(int x: arr)
	        System.out.print(x+" ");
    }
}
