public class ReverseWordsInString {

    static void reverseWords(char[] str){       //efficient
        int start = 0;
        for (int end = 0; end < str.length; end++) {
            if(str[end] == ' '){
                reverse(str,start,end-1);
                start = end+1;
            }
        }
        reverse(str, start, str.length-1);
        reverse(str, 0, str.length-1);
    }
    static void reverse(char str[],int low,int high){
        while (low <= high) {
            //swap
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        String s = "Welcome to Gfg";//int n=s.length();
        char[] str = s.toCharArray();
        System.out.println("After reversing words in the string:");
        reverseWords(str);
        System.out.println(str); 
    }
}
