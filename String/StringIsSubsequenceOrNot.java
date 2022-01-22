//subsequence :- need not to be contigious
//substring :- contigious characters. 
//eg:- for "abcd" -> abc , bcd are substring but not 'abd'
        //abd, bd  are subsequence. total = 2^n subsequences
public class StringIsSubsequenceOrNot {
    static boolean isSubSeq(String s1,String s2){     //iterative O(n+m)
        int j = 0;
        for(int i=0;i<s1.length() && j<s2.length();i++){
            if(s1.charAt(i) == s2.charAt(j))
            j++;
        }
        return j==s2.length();
    }
    
    public static void main(String[] args) {
        String s1,s2;
        s1 = "sudheer";
        s2 = "dher";
        System.out.println(isSubSeq(s1,s2));
        
    }
}
