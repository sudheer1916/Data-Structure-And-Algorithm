class palindrome {
    
    static boolean fun(String s,int start, int end){
        if(start>=end)
        return true;

        return (s.charAt(start)==s.charAt(end) && fun(s,start+1,end-1));
    }
    public static void main(String[] args) {
        
        int Start=0;
        
        String s="abba";
        System.out.println(fun(s,Start,s.length()-1));

        String st = "geeks";
        System.out.println(fun(st,Start,st.length()-1));
        
    }
}
