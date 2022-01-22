import java.util.Arrays;
import java.util.Comparator;

public class Sorting4 implements Comparator<Integer>{
    public int compare(Integer a,Integer b){
        return a%2 - b%2;
    }
}
class Sorting4Main{
    public static void main(String[] args) {
        Integer[] arr = {5, 20, 10, 3, 12};          // Integer array
        Arrays.sort(arr,new Sorting4());
        System.out.println(Arrays.toString(arr));    // Displaying the sorted array
    }
}
