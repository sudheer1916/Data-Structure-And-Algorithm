import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
eg:-stable sorts : bubbleSort,Insertion Sort, Mergesort
eg:-unstable sorts : Selection Sort,QuickSort,heap Sort
*/

class CollectionSort {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(20);

        // List is sorted in the natural order
        Collections.sort(list);
        
        // Displaying the sorted list
        System.out.println(list);
        
        // Sorting the list in reverse order
        Collections.sort(list, Collections.reverseOrder()); 

        // Let us print the sorted list 
        System.out.println(list);
    }
}
