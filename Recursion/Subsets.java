class Subsets {
    static void fun(String s,String cur,int i){
        if(i == s.length())
        {
            System.out.println("'"+cur+"'");
            return ;
        }
        fun(s,cur,i+1);
        fun(s,cur+s.charAt(i),i+1);
    }
    public static void main(String[] args) {

        int i=0;             //should be intialised by an empty string and i=0 ,because i will be compared with str.length 

        String str = "abc";
        fun(str,"",i); 
    }    
}
