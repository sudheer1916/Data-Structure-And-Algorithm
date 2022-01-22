//import java.util.Arrays;

class LeftmostRepeatingCharacter {
    static final int CHAR = 256;        
    /*static int leftMost(String str){      //better solution O(n)
        int count[] = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int j = 0; j < str.length(); j++) {
            if(count[str.charAt(j)] > 1)
            return j;
        }
        return -1;
    }*/

    /*static int leftMost(String str){        //efficient1 O(n)
        int[] findex = new int[CHAR];
        Arrays.fill(findex, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int fi = findex[str.charAt(i)];
            if(fi == -1)
            findex[str.charAt(i)] = i;
            else
            res = Math.min(res, fi);
        }
        return (res == Integer.MAX_VALUE)?-1:res;
    }*/

    static int leftMost(String str){
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for(int i = str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)])      //if already true
            res = i;
            else
            visited[str.charAt(i)] = true;   //mark them true
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abcced";
        String str1 = "abcde";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
        System.out.println(leftMost(str1));
    }
}
//extension of this problem
//Leftmost Non-repeating Element
//Given a string, the task is to find the leftmost character that does not repeat.
/*class LeftmostRepeatingCharacter{
    static final int CHAR=256;

    static int nonRep(String str)       //better
    {
    int[] count=new int[CHAR];
    for(int i=0;i<str.length();i++){
        count[str.charAt(i)]++;
    }
    for(int i=0;i<str.length();i++){
        if(count[str.charAt(i)]==1)return i;
    }
    return -1;
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));  
    }
}*/