public class MatrixSpiralTraversal {
    //theta(r*c)
    static void printSpiral(int mat[][],int r,int c){
        int top=0, bottom=r-1;
        int left=0,right=c-1;
        while (top<=bottom && left<=right) {

            for(int i=left;i<=right;i++)
            System.out.print(mat[top][i]+" ");
            top++;

            for(int i=top;i<=bottom;i++)
            System.out.print(mat[i][right]+" ");
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--)
                System.out.print(mat[bottom][i]+" ");
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                System.out.print(mat[i][left]+" ");
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};

    	printSpiral(arr, 4, 4);
    }
}
