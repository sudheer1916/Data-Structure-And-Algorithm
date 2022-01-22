import java.util.Arrays;
import java.util.Collections;

public class Sorting3 {
    public static void main(String[] args) {
        Integer[] arr = {5, 20, 10, 12};         //non-primitive type
        // Note that we have Integer here instead of int[] as Collections.
        // reverseOrder doesn't work for primitive types.
        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
