//only occurs when there is only 2 odd occurings in the array
class OddOccuring1 {
    void oddvalue(int[] arr){
        int res = 0,res1=0,res2=0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        int sn = res & (~(res-1));

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & sn) != 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }
        System.out.println( "result = " + res1 + " " + res2);
    }
}
class OddOccuringMain1 {
    public static void main(String[] args) {

        int arr[]= {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};
        OddOccuring1 obj = new OddOccuring1();
        obj.oddvalue(arr);
    }
}
