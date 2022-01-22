//using recursion function
class Factorial {

static int fun(int n){          //non-tail recusive method
    if(n==0 || n==1)
    return 1; 
    return n*fun(n-1);
}

static int fun1(int n,int k){          //tail recusive method
    if(n==0 || n==1)
    return k;
    return fun1(n-1, k*n);
}

    public static void main(String[] args) {
        System.out.println(fun(5));
        System.out.println(fun1(4,1));              ////intialize k = 1 for tail recursive
    }
}
