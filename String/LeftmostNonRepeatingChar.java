import java.util.Arrays;

public class LeftmostNonRepeatingChar {
    /*static int nonRep(String str){      //naive O(n^2)
        int n = str.length();
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if(i != j && str.charAt(i) == str.charAt(j)){
                    flag = true;
                    break;
                }                
            }
            if(flag == false)
            return i;
        }
        return -1;
    }*/

    /*static int nonRep(String str){         //better O(n) 
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if(count[str.charAt(i)] == 1)
            return i;
        }
        return -1;
    }*/

    static final int CHAR=256;
    static int nonRep(String str){
        int count[] = new int[CHAR];
        Arrays.fill(count, -1);
        for (int i = 0; i < str.length(); i++) {
            if(count[i] == -1)
            count[i] = i;
            else 
            count[i] = -2;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < count.length; i++) {
            if(count[i]>=0)
            res = Math.min(res, i);
        }
        return (res == Integer.MAX_VALUE)?-1:res;
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));
    }
}
