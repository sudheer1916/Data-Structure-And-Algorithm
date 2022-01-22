public class MatrixRotationBy90 {
    //Anti-clockwise
    static int n = 4;
	/*static void rotate90(int mat[][])          //naive theta(n^2)
	{                                          //s.c theta(n^2) extra space 
		int temp[][] = new int[n][n];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				temp[n - j - 1][i] = mat[i][j];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = temp[i][j];

	}*/

    //first swap the matrix
    static void swap(int mat[][],int i,int j){        //efficient
        int temp = mat[i][j];                       //T.c - theta(n^2) 
			mat[i][j] = mat[j][i];                  //s.c - theta(1) space
			mat[j][i] = temp;
    }
    //secondly swap elements in the coloumn
    static void swap1(int mat[][],int i,int low,int high){
        int temp = mat[low][i];
        mat[low][i] = mat[high][i];
        mat[high][i] = temp;
    }

    static void rotate90(int mat[][]){
        //transpose
        for(int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++)
				swap(mat, i, j);
        
        //reverse colomn
        for (int i = 0; i < n; i++) {       //c
            int low=0,high = n-1;           //c=0,c=n-1
            while (low<high) {
                swap1(mat,i,low,high);
                low++;
                high--;
            }
        }
    }


    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};

    	rotate90(arr);

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}

			System.out.println();
		}	
    }
}
