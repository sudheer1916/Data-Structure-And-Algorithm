import java.util.Arrays;

// A user-defined Point class implementing Comparable interface
class Point implements Comparable<Point>{
    int x,y;
    Point(int x, int y)          // Costructor intialising x & y
    {
        this.x = x;
        this.y = y;
    }
    
    // compareTo() function defining the nature of sorting
    // i.e., according to x-coordinate

    public int compareTo(Point P){
        // Comparing two objects by Subtracting the passed object from current object
        return this.x - P.x;
    }
}

class Sorting2 {
    public static void main(String[] args) {
        Point arr[] = {
            new Point(10,20),
            new Point(3,12),
            new Point(5,7)
        };
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i].x + " " + arr[i].y);
    }
}

//method-2
/*
// A sample Java program to implementing
// Comparator alongside Arrays.sort(). 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

// Point class which does not implement
// Comparable interface. Thus the objects
// of this class are not comparable.
class Point
{
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

// This class implements 
// Comparator interface to compare 
class MyCmp implements Comparator<Point>
{
    // Sorts the Point objects according
    // to x-coordinates in natural order
    public int compare(Point p1, Point p2)
    {
        return p1.x - p2.x;
    }
}

// Main class
class Sorting2 
{ 
    public static void main(String[] args) 
    { 
        // Array of 3 objects
        Point arr[] = {
            new Point(10, 20), 
            new Point(3, 12), 
            new Point(5, 7) };
            
        // Sorting the object containing the array 
        // by passing the array and object MyCmp
        Arrays.sort(arr, new MyCmp());
        
        // Displaying the sorted array
        for(int i = 0; i < arr.length; i++)
            System.out.println(
                arr[i].x + " " + arr[i].y);
    } 
} */
