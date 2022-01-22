import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionSort1Main{
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5, 10));
        list.add(new Point(2, 20));  
        list.add(new Point(10, 30));

        Collections.sort(list);
        for (Point p : list) {
            System.out.println(p.x+" "+p.y);
        }
    }
}
