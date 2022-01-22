class TwoPointerApproach {
    //O(n)  //efficient
    //Find pair in sorted array which gives sum X 
    //(recommended)for sorted we use two pointer approach,for unsorted we use hashing.
    static boolean isPresent(int arr[],int n,int sum){
        int h = n-1,l = 0;
        while (l<=h) {
            if(arr[l]+arr[h] == sum)
            return true;
            else if(arr[l]+arr[h] > sum)
            h--;
            else l++;
        }
        return false;
    }
    public static void main (String[] args) {
        int arr[] = new int[]{2, 3, 7, 8, 11};     //sorted        
        int n = arr.length;
        int sum = 14;
        
        System.out.println(isPresent(arr, n, sum));
        
    }
}
//solution for unsorted :- using hashing
/*
// Java implementation using Hashing 
import java.io.*;
import java.util.HashSet;
class PairSum { 
	static void printpairs(int arr[], int sum) 
	{ 
		HashSet<Integer> s = new HashSet<Integer>(); 
		for (int i = 0; i < arr.length; ++i) { 
			int temp = sum - arr[i]; 

			// checking for condition 
			if (s.contains(temp)) { 
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")"); 
			} 
			s.add(arr[i]); 
		} 
	} 

	// Main to test the above function 
	public static void main(String[] args) 
	{ 
		int A[] = { 1, 4, 45, 6, 10, 8 };         //unsorted array
		int n = 16; 
		printpairs(A, n); 
	} 
} */
