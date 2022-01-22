//we should have a permutation of string in the given string in contiguous manner
class AnagramSearch {
    static final int CHAR = 256;
    /*static boolean areAnagram(String txt,String pat,int i){
        int[] count = new int[CHAR];
        for (int j = 0; j < pat.length(); j++) {
            count[pat.charAt(j)]++;
            count[txt.charAt(i+j)]--;
        }
        for (int j = 0; j < count.length; j++) {
            if(count[j] != 0)
            return false;
        }
        return true;
    }
    static boolean isPresent(String txt,String pat){
        int n = txt.length();       //naive O((n-m+1)*m)
        int m = pat.length();
        for (int i = 0; i < n-m; i++) {
            if(areAnagram(txt,pat,i))
            return true;
        }
        return false;
    }*/

    static boolean areSame(int[] ct,int[] cp){
        for (int i = 0; i < CHAR; i++) {
            if(ct[i] != cp[i])          //efficient O(m+(n-m)*CHAR
            return false;               //O(n*CHAR)
        }
        return true;
    }

    static boolean isPresent(String txt,String pat){
        int[] ct = new int[CHAR];
        int[] cp = new int[CHAR];
        for (int i = 0; i < pat.length(); i++) {
            ct[txt.charAt(i)]++;
            cp[pat.charAt(i)]++;
        }
        for(int i = pat.length();i<txt.length();i++){
            if(areSame(ct,cp))
            return true;
            //slidiing window
            ct[txt.charAt(i)]++;        //add last char of current window 
            ct[txt.charAt(i-pat.length())]--;   //removes first char of previous window 
        }
        return false;
    }

    public static void main(String[] args) {
        String txt = "geeksforgeeks"; 
        String pat = "frog";  
        if (isPresent(txt, pat)) 
            System.out.println("Anagram search found"); 
        else
            System.out.println("Anagram search not found");
    }
}
