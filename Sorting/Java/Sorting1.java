import java.util.Arrays;
// Java program to sort an array 
// using Arrays.sort()
//sorting primitive type sorting is not guaranteed to be stable
//i.e algorithm used is dual-pivot quicksort
//for stable solution, we use algorithm based on mergesort
public class Sorting1{
    public static void main(String[] args) {
        int[] arr1 = {5, 20, 12, 30};
        char[] arr2 = {'B', 'B', 'A', 'C', 'A'};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
/*
// A sample Java program to sort a subarray 
// using Arrays.sort(). 
import java.util.Arrays; 

public class SortExample 
{ 
    public static void main(String[] args) 
    { 
        int[] arr = {5, 30, 20, 10, 8}; 

        // Sort subarray from index 1 to 3, i.e., 
        // only sort subarray {30, 20, 10} and 
        // keep other elements as it is. 
        Arrays.sort(arr, 1, 4); 

        System.out.println(Arrays.toString(arr)); 
    } 
} 
*/