public class SecondLargestElement {
    // static int getLargest(int arr[]){
    //     int res = 0;
    //     for (int i = 1; i < arr.length; i++) {
    //         if(arr[i]>arr[res])
    //         res = i;
    //     }
    //     return res;
    // }
    // static int getSecond(int arr[]){     //naive
    //     int lar = getLargest(arr);
    //     int second = -1;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] != arr[lar]){
    //             if(second == -1)
    //             second = i;
    //             else if(arr[i] > arr[second])
    //             second = i;
    //         }
    //     }
    //     return second;
    // }
    static int getSecond(int arr[]){            //efficient     theta(n)
        int second = -1, first = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[first]){
                second = first;
                first = i;
            }
            else if(arr[i] < arr[first]){
                if(second == -1)
                second = i;
                else if(arr[i] > arr[second])
                second = i;
                /*
                if(second == -1 || arr[i] > arr[second])
                second = i;
                */
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int arr[] = {5,20,12,20,8};
        int lar = getSecond(arr);
        System.out.println("Second largest element = "+ arr[lar]);
    }
}
