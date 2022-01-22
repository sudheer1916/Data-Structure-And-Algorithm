public class PatternSearching {
    static void patSearchinng(String txt, String pat){
        int m = pat.length();       //naive O((n-m+1)*m)
        int n = txt.length();
        for (int i = 0; i <= (n-m); i++) {
            int j;
            for (j = 0; j < m; j++) {
                if(pat.charAt(j) != txt.charAt(i+j))
                break;
            }
            if(j == m)
            System.out.print(i+" ");
        }
    }
    //Improved Naive Pattern Searching for a pattern with distinct characters and a text
    /*static void patSearchinng1(String txt,String pat){
    int m=pat.length();             
    int n=txt.length();
    for(int i=0;i<=(n-m);  ){           //improved naive O(n)
        int j;
        for(j=0;j<m;j++){
            if(pat.charAt(j)!=txt.charAt(i+j))
            break;
        }
        if(j == m)
        System.out.print(i+" ");

        if(j == 0)
        i++;
        else
        i = (i+j);       
    }
    }*/
    public static void main(String[] args) {
        String txt = "ABCABCD";
        String pat="ABCD";
        String txt1 = "aaaaaaa";
        String pat1="aaa";
        System.out.println("All index numbers where pattern found: ");
        patSearchinng(txt,pat);
        System.out.println();
        patSearchinng(txt1,pat1);
    }
}
