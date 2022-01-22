import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(5, "computer");
        tm.put(10, "sudheer");
        tm.put(11, "jhansi");
        tm.put(12, "balaraju");
        tm.put(13, "kavitha");
        tm.put(14, "chitti");
        tm.put(15, "dhanush");
        tm.put(25, "java");
        System.out.println(tm);
        System.out.println(tm.containsKey(12));
        System.out.println(tm.containsValue("chitti"));
        for(Map.Entry<Integer,String> e : tm.entrySet())
        System.out.println(e.getKey()+" "+e.getValue());
        System.out.println("<--------------------->");
        System.out.println(tm.higherKey(11));
        System.out.println(tm.lowerKey(14));
        System.out.println(tm.floorKey(9));
        System.out.println(tm.ceilingKey(17));
        System.out.println("<--------------------->");
        System.out.println(tm.higherEntry(11).getValue());
        System.out.println(tm.lowerEntry(14).getValue());
        System.out.println(tm.floorEntry(9).getValue());
        System.out.println(tm.ceilingEntry(17).getValue());
    }
}
