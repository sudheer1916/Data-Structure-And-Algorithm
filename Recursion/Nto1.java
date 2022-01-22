class Nto1 {
    static void fun(int n){
        if (n==0) {
            return ;
        }
        System.out.print(n+" ");
        fun(n-1);
        
    }

    //T.C, t(n) = t(n-1) +theta(1)
    public static void main(String[] args) {
        fun(6);
    }
}
//tail recursion = i.e takes less time for computing on modern compliers.