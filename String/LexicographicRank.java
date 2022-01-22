public class LexicographicRank {
    static final int CHAR = 256;
    //all char of input string are distinct
    static int factorial(int n){
        return (n <= 1) ? 1:n*factorial(n-1);
    }
    static int lexRank(String str){     //efficient O(n*char)
        int res = 1;
        int n = str.length();
        int fact = factorial(n);
        int count[] = new int[CHAR];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }
        for (int j = 1; j < count.length; j++) {    //cumulative count
            count[j] += count[j-1];
        }

        for(int i=0;i<n-1;i++){
            fact = fact/(n-i);
            res = res + count[str.charAt(i)-1]*fact;
            for(int j = str.charAt(i); j<CHAR; j++)
            count[j]--;
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "STRING"; 
        System.out.print(lexRank(str)); 
    }
}
