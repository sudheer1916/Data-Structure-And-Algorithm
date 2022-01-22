class CheckStringsRotations {
    static boolean areRotations(String s1,String s2){
        if(s1.length() != s2.length())      //efficient theta(n)
        return false;
        String s = s1+s2;
        return (s.indexOf(s2)>=0);
    }
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2="CDAB";
        if(areRotations(s1,s2))
        System.out.println("Strings are rotations of each other");
        else
        System.out.println("Strings are not rotations of each other"); 
    }
}
