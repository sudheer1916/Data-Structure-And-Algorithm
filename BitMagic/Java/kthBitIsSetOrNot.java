import java.util.Scanner;

class BitsM1{
    boolean bit(int n,int k){    //using rightshift
        if(((n>>(k-1)&1))==1){
            return true;
        }
        else return false;
    }
}

class BitsM2{
    void bit(int n,int k){      //using leftshift
        if((n & (1<<(k-1))) != 0){
            System.out.println("SET");

        }
        else System.out.println("NOT SET");
    }
}

class BitsMain{
    public static void main(String[] args) {
        //BitsM1 obj = new BitsM1();               //method1  using right shift
        BitsM2 obj = new BitsM2();                 //method2 using left shift
        int n,k;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        n=sc.nextInt();
        System.out.println("enter the k value ");
        k=sc.nextInt();
        obj.bit(n, k);
        sc.close();
    }
}