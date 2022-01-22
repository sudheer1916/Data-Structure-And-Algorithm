class N_bonacci_series {
    //it means to print 'n' bonacci numbers 
    //in series, first n-1 elements are always zeros the immidiate following element is always 1.
    
    // Function to print bonacci series 
	static void series(int n, int m) 
	{ 
	
		// Assuming m > n. 
		int a[] = new int[m]; 
		for(int i = 0; i < m; i++) 
			a[i] = 0; 
			
		a[n - 1] = 1; 
		a[n] = 1; 
	
		// Uses sliding window 
		for (int i = n + 1; i < m; i++) 
			a[i] = 2 * a[i - 1] - a[i - n - 1]; 
	
		// Printing result 
		for (int i = 0; i < m; i++) 
			System.out.print(a[i] + " "); 
	} 




    public static void main(String[] args) {
        int N = 5, M = 15;                 //m = number of numbeers to be printed
		series(N, M);                      //n means sum of previous n elements
    }
}
