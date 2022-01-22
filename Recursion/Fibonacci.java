class Fibonacci {
    static int fun(int n){
        if(n<=1)
        return n;
        else
        return fun(n-1) + fun(n-2);
    }
    public static void main(String[] args) {
        System.out.print(fun(7)+ " ");
    }
}
