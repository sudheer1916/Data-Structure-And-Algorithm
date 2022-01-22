class Palindrome{
    /*static boolean isPal(String str){       //naive theta(n)
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        return str.equals(s.toString());
    }*/

    static boolean isPal(String str){       //O(n)  efficient 
        int begin=0;
        int end = str.length()-1;
        while (begin<end) {
            if(str.charAt(begin) != str.charAt(end))
            return false;
            begin++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPal("abcba"));
        System.out.println(isPal("sudheer"));
    }
}