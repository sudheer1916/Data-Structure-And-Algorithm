//working of Hashset
//import java.util.HashSet;
import java.util.*;
class Hashset{
    public static void main(String[] args) {
        //HashSet<String> h = new HashSet();
        HashSet<String> h = new HashSet<String>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");
        System.out.println(h.size());
        System.out.println(h);
        System.out.println(h.contains("ide"));

        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.print(i.next()+" ");
        }
        h.remove("ide");
        System.out.println();
        System.out.println(h.size());
        for(String s:h)
        System.out.print(s+" ");
        
        System.out.println();
        System.out.println(h.isEmpty());
    }
}