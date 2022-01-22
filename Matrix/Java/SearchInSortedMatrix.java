class SearchInSortedMatrix {

    static int R = 4, C = 4;

	/*static void search(int mat[][], int x)          //naive O(R*c)
	{
		for(int i = 0; i < R; i++)
		{
			for(int j = 0; j < C; j++)
			{
				if(mat[i][j] == x)
				{
					System.out.println("Found at (" + i + ", " + j + ")");
					
					return;
				}
			}
		}

		System.out.println("Not Found");
	}*/

    static void search(int mat[][],int x){        //efficient O(r+c)
        int i=0,j=C-1;
        while (i<R && j>=0) {
            if(mat[i][j] == x){
                System.out.println("found at "+i+" row "+j+" coloumn");
                return ;
            }
            
            else if(mat[i][j] > x)
            j--;
            else   //mat[i][j] < x
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30, 40},
    				   {15, 25, 35, 45},
    				   {27, 29, 35, 45},
    				   {32, 33, 39, 50}};
    	int x = 29;	   

    	search(arr, x);
    }
}
