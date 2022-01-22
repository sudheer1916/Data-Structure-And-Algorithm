import java.util.HashMap;
import java.util.Map;
class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<>();
        h.put("gfg",10);
        h.put("ide",15);
        h.put("courses",20);
        System.out.println(h);
        System.out.println(h.size());
        // Iterating over HashMap 
        for(Map.Entry<String,Integer> e :h.entrySet())
        System.out.print(e.getKey()+"="+e.getValue()+',');
        System.out.println();
        if(h.containsValue(15))
        System.out.println("yes");
        else
        System.out.println("no");
        // Check for a key
        if(h.containsKey("ide")) 
        System.out.println("Yes");
        else
        System.out.println("No");
        
        // Remove key "ide"
        // and returns the associated value 15
        h.remove("ide");
        System.out.println(h.size());
        // Get value corresponding to passed key
        // <"ide", 15>
        System.out.println(h.get("ide"));
        
        // The given key is absent
        System.out.println(h.get("practice"));
    }
}
