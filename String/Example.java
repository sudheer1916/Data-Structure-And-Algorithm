import java.util.*;

public class Example {
    static void decrypted(String str,int pos){
        //ArrayList<Integer> arr = new ArrayList<Integer>();
        char arr[] = new char[100];
        arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == (1|2|3|4|5|6|7|8|9))
            {
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 ;
        int pos;
        System.out.println(" enter a string ");
        input1 = sc.nextLine();
        System.out.println(" enter the position ");
        pos = sc.nextInt(); 
        decrypted(input1,pos);
        sc.close();
    }
}
