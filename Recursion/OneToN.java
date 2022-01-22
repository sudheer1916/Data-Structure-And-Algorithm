class OneToN {
    static void fun(int n){
        if(n == 0)
        return ;
        fun(n-1);
        System.out.print(n+" ");
    }

    static void fun1(int n,int k){              //fun1 is a tail recursive solution
        if(n==0)
        return ;
        System.out.print(k+" ");
        fun1(n-1,k+1);
    }

    public static void main(String[] args) {
        fun(8);
        System.out.println();
        fun1(7,1);          //intialize k = 1 for tail recursive
    }
}
