public class MoveZerosToEnd {
    static void zero(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,8,0,0,12,0};
        zero(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
