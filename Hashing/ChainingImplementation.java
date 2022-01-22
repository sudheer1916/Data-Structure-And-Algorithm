import java.util.ArrayList;
import java.util.LinkedList;
//program to demonstrate implementation of our own hash table
//with chaining for collision detection
class ChainingImplementation{
    int BUCKET;     //no of entities in the hashtable
    ArrayList<LinkedList<Integer>> table;

    ChainingImplementation(int b){
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }
    void insert(Integer a){
        int i = a % BUCKET;         //hash function
        table.get(i).add(a);
    }
    boolean search(Integer a){
        int i = a % BUCKET;
        return table.get(i).contains(a);
    }
    void delete(Integer a){
        int i = a % BUCKET;
        table.get(i).remove();
    }
    public static void main(String[] args) {
        ChainingImplementation myhash = new ChainingImplementation(7);
        myhash.insert(10);
        myhash.insert(20);
        myhash.insert(15);
        myhash.insert(7);
        System.out.println(myhash.search(10));
        myhash.delete(15);
        System.out.println(myhash.search(15));
    }
}