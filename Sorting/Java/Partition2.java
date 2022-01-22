class Partition2 {
    // Hoare Partition which is another method of partitioning
    //better than previous partition methods
    //T.s -> O(n) ,takes constant space
    //first element as pivoted element
    //not stable algo 
    //Hoare Partition is nearly three times faster than Lomuto Partition
    static int partition2(int arr[],int l,int h){
        int pivot = arr[l];
        int i=l-1,j=h+1;
        while (true) {
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j) return j;
            //swap(arr[i],arr[j])
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5,3,8,4,2,7,1,10};
        
        int n = arr.length;
        int m = partition2(arr,0,n-1);
        System.out.println(m);                   //Partition index 
        
	    for(int x: arr)
	        System.out.print(x+" ");
    }
}
