import java.util.Scanner;

class Palindrome1 {
    static int countPalindrome(String input1,int input2){
        int count = 0, begin=0;
        for (int i = 0; i < input2; i++) {
            if(input1.charAt(i) == ' '){
                
                int end = input1.charAt(i-1);
                while (begin<end) {
                    if(input1.charAt(begin) == input1.charAt(end)){
                        begin++;
                        end--;
                        if(begin>end) 
                        count++;
                    } 
                    begin = input1.charAt(i+1);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 ;
        System.out.println(" enter a string ");
        input1 = sc.nextLine();
        int input2 = input1.length();
        countPalindrome(input1,input2);
        sc.close();
    }
}

