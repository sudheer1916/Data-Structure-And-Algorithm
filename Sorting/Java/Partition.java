//Partition method of Quick Sort
//stable algorithm
//T.C -> O(n)              naive method
class Partition {
    static void partition(int arr[],int l,int h,int par){
        int temp[] = new int[h-l+1];
        int index = 0;
        for (int i = l; i < arr.length; i++) {
            if(arr[i]<=arr[par]){
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[par]){
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }
    //naive 
    public static void main(String[] args) {
        int arr[] = new int[]{5,13,6,9,12,11,8};
        
        int n = arr.length;
        partition(arr,0,n-1,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
    }
}
