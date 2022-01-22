class CycleSort {
    //applicable for distinct elements
    static void cycleSortDistinct(int arr[]){
        for(int cs=0;cs<arr.length;cs++){
            int item = arr[cs];
            int pos = cs;
            for (int i = cs; i < arr.length; i++) {
                if (arr[i]<item)
                pos++;
            }

            //swap(item,arr[pos])           
            int temp=item;
            item=arr[pos];
            arr[pos]=temp;

            while (pos != cs) {
                pos = cs;
                for(int i = cs+1;i<arr.length;i++)
                if(arr[i]<item)
                pos++;
                //swap(item,arr[pos])
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = { 20,40,50,10,30 }; 
        //int n = arr.length; 
        cycleSortDistinct(arr); 
   
        for (int i = 0; i < arr.length; i++) 
            System.out.print( arr[i] + " ");
    }
}
