import java.util.Scanner;

class Bitwise {
    void bits(int x,int y){
        System.out.println("Bitwise And = "+ (x & y));
        System.out.println("Bitwise OR = "+ (x | y));
        System.out.println("Bitwise NOT = "+ (~x));
        System.out.println("Bitwise XOR = "+ (x ^ y));

    }
}
class BitwiseMain{
    public static void main(String[] args) {
        Bitwise obj = new Bitwise();
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x ");
        x=sc.nextInt();
        System.out.println("enter the value of y ");
        y=sc.nextInt();
        obj.bits(x, y);
        sc.close();
    }
}
