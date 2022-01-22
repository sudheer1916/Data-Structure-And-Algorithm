import java.util.Iterator;
import java.util.TreeSet;
//add(),contains(),remove(),floor(),ceiling(),higher(),lower() -> O(logn)
//size(),isEmpty() -> O(1)
class TreeSetExample{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("gfg");
        ts.add("course");
        ts.add("ide");
        ts.add("sudheer");
        System.out.println(ts);       //will print in lexiographal order
        System.out.println(ts.contains("sudheer"));
        ts.remove("ide");
        System.out.println(ts.lower("gfg"));
        System.out.println(ts.higher("sudheer"));
        System.out.println(ts.floor("cozy"));
        //System.out.println(ts.ceiling("gfg"));
        System.out.println(ts.ceiling("egg"));
        System.out.println("first/lowest = "+ts.first());
        System.out.println("last/highest = "+ts.last());
        System.out.println("headset = "+ts.headSet("gfg"));  //to gfg
        System.out.println("treeset"+ts.tailSet("gfg"));    //from gfg
        Iterator<String> i =  ts.iterator();
        while (i.hasNext()) {
            System.out.print(i.next()+" ");
        }
        /*for(String s:ts)
        System.out.print(s+" ");*/
    }
}