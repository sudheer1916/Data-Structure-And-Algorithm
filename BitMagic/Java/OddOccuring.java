class OddOccuring {
    /*void find(int[] arr){                         //naive method  T.C = O(n^2)
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count%2!=0) {
                System.out.println(arr[i]);
            }
        }
    }*/

    static int findOdd(int arr[])                   //efficient method T.C = O(n)
    {
        int res = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            res = res ^ arr[i];
        }
        
        return res;
    }
}

class OddOccuringMain{                          
    public static void main(String[] args) {
        int n[]= {3, 3, 4, 4, 4, 5, 5, 3, 3};
        //OddOccuring obj = new OddOccuring();
        //obj.find(n);
        System.out.println(OddOccuring.findOdd(n));
    }
}
