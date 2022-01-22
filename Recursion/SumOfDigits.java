class SumOfDigits {
    //T.C = theta(no of digits in n)
    static int sum(int n){
        if(n == 0)
        return 0;
        
        return sum(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(sum(253));
        System.out.println(sum(2543));
    }
}
