class Josephus {

    static int jos(int n, int k){
        if(n==1)
        return 0;
        else
        return (jos(n-1,k)+k)%n;
    }

    static int myjos(int n,int k){             //if n starts with 1
        return jos(n,k)+1;                     //if n starts with 0, then we can directly use jos()
    }

    public static void main(String[] args) {
        System.out.println(myjos(5, 3));
        System.out.println(myjos(7, 2));       
    }
}
