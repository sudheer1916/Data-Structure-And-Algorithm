public class MatricBoundaryTraversal {
    static int r=4,c=4;                     //theta(r+c)
    static void bTraversal(int mat[][]){
        if(r==1){
            for (int i = 0; i < c; i++) {
                System.out.print(mat[0][i]+" ");
            }
        }
        else if(c==1){
            for (int i = 0; i < r; i++) {
                System.out.print(mat[i][0]+" ");
            }
        }
        else{
            for(int i=0;i<c;i++)
            System.out.print(mat[0][i]+" ");
            for(int j=1;j<r;j++)
            System.out.print(mat[j][c-1]+" ");
            for(int i=c-2;i>=0;i--)
            System.out.print(mat[r-1][i]+" ");
            for(int j=r-2;j>0;j--)
            System.out.print(mat[j][0]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};

    	bTraversal(arr);
    }
}
