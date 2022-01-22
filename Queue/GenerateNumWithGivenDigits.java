import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*Given a number n, 
print first n number(in increasing order) such that 
all these numbers have digits in set {5, 6}*/
class GenerateNumWithGivenDigits {
    static void printFirstN(int n){         //O(n)
        Queue<String> q = new LinkedList<String>();
        q.add("5");
        q.add("6");

        for (int i = 0; i < n; i++) {
            String curr = q.poll();
            System.out.print(curr+" ");

            q.add(curr+"5");
            q.add(curr+"6");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N = ");
        int n = sc.nextInt();
        printFirstN(n);
        sc.close();

    }
}
