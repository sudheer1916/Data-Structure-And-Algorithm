class SumNatural {
    //T.c =theta(n)
    static int fun(int n){
        if(n==0)
        return 0;
        return n + fun(n-1);

        //return (n*(n+1))/2;

    }
    public static void main(String[] args) {
        System.out.println(fun(5));
    }
}
