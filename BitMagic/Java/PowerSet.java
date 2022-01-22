import java.util.Scanner;
//T.C = theta((2^n)*n)
class PowerSet {
    void printPowerSet(String s){
        int len = s.length();
        int pow = (int)Math.pow(2,len);
        for(int counter=0;counter<pow;counter++){
            for (int j = 0; j < len; j++) {
                if ((counter & (1<<j))!=0)                      //i.e (1<<j) = multiplies the n with 2
                    System.out.print(s.charAt(j));   
            }
            System.out.println();
        }
    }
}
class PowerSetMain{
    public static void main(String[] args) {
        PowerSet obj = new PowerSet();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String s = sc.nextLine();
        obj.printPowerSet(s);
        sc.close();
    }
}
