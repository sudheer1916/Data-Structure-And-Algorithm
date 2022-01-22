import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Point1{
    int x,y;
    Point1(int x,int y){
        this.x = x;
        this.y = y;
    }
    /*Point1(int a,int b){
        a = x;
        b = y;
    }*/
}
class MyComparator implements Comparator<Point1>{
    public int compare(Point1 p1,Point1 p2){
        return p1.x - p2.y;
    }
    
}
class CollectionSort2 {
    public static void main(String[] args) {
        List<Point1> list = new ArrayList<>();
        list.add(new Point1(5, 10));
        list.add(new Point1(2, 20));  
        list.add(new Point1(10, 30));

        Collections.sort(list,new MyComparator());

        for (Point1 p: list)
            System.out.println(p.x + " " + p.y);
    }
}

