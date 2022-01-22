import java.util.Scanner;

class CountSet {
    //naive solution T.C = theta(no of bits in n)
    void fun(int n){
        int res = 0;
        /*while (n>0) {
            if(n%2!=0)
            res++;
            n=n/2;
        }*/
        while (n>0) {
            if((n&1) == 1)
            res++;
            n=n>>1;
        }

        System.out.println("result = "+res);
    }
    //brian kerningam's algorithm    T.C = theta(set bit count)
    /*suppose n=40. n = 40 = 101000
                  n-1 = 39 = 100111 performs and operation then
                    result = 100000  = 32

               then n = 32 = 100000
                  n-1 = 31 = 011111 performs and operation then
                    result = 000000 = 0 and loop stops*/

    void fun1(int n){                                  
        int res=0;                                     
        while (n>0) {
            n=n&(n-1);                //The expression simply turns off the rightmost set bit
            res++;
        }
        System.out.println("result = "+ res);
    }

}


class CountSetMain{
    public static void main(String[] args) {
        CountSet obj = new CountSet();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number ");
        int x = sc.nextInt();
        obj.fun(x);
        obj.fun1(x);
        sc.close();
    }
}
