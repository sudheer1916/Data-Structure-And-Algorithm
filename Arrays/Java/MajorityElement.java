class MajorityElement {
    /*static int major(int arr[]){                     //naive method O(n^2)
        for (int i = 0; i < arr.length; i++) {               
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[i] == arr[j])
                count++;
            }
            if(count>arr.length/2)
            return i;
        }
        return -1;
    }
    */
    
    static int major(int arr[]){                          //efficient O(n) 
        int count =1;
        int res =0;                                       //Moore's Voting Algorithm
        for (int i = 1; i < arr.length; i++) {            //phase-1 finds a candidate
            if(arr[i]==arr[i-1])                          //phase-1 gurantee that if there is a majority element then, 
            count++;                                      //that element would be candidate
            else count--;
            if(count == 0){
                res =i;
                count = 1;
            }                                            //note:-this algorithm may not always give index of the first  
        }                                                //occurence of majority element
        count = 0;
        for (int i = 0; i < arr.length; i++) {           //phase-2 checks wheather the candidate is majority or not
            if(arr[i]==arr[res])                         //need of phase-2 is when you do not have majority element 
            count++;
        }
        if(count <= arr.length/2)
        return -1;
        
        return res;       
    }


    public static void main(String[] args) {
        int[] arr = {8,7,6,8,6,6,6,6};
        System.out.println("majority element is "+arr[major(arr)]);
    }
}
