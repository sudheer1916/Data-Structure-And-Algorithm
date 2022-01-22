import java.util.ArrayList;

class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.ensureCapacity(10);
        for(int i=1;i<=10;i++)
        {
        a.add(i);
        }

        System.out.println(a);
    }
}