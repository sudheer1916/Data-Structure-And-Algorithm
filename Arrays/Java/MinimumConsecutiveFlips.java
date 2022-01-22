class MinimumConsecutiveFlips {
    static void flips(int bi[]){
        int i;
        for (i = 1; i < bi.length; i++) {                        //efficient O(n)
            if(bi[i] != bi[i-1]){                                //if beginnning and ending elements of array are same, then
                if(bi[i]!=bi[0])                                 //group count difference is 1
                System.out.print("from "+i+"to");                //if beginnning and ending elements of array are not same, then
                else                                             //group count difference is 0
                System.out.println(i-1);                         
            }                                                    //IDEA : we should always flip second group elements
        }
        if(bi[bi.length-1]!=bi[0])                               //this "if" block is used when group count difference is 0                           
        System.out.println(i-1);                                 //to handle the "i=arr.length -1" case.        
    }
    // static void flips(int arr[]){       //naive    O(n)
    //     int flip;
    //     if(arr[0] == 0) flip = 1;
    //     else flip = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] == flip)
    //         System.out.println("flip "+ i);
    //     }
    // }
    public static void main(String[] args) {
        int binary[] = {0,0,1,1,0,0,1,1,0,1};
        int binary1[] = {0,0,1,1,0,0,1,1,0};
        flips(binary);
        System.out.println("--------------");
        flips(binary1);
    }
}
