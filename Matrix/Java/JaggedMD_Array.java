class JaggedMD_Array{

    //jagged array

    public static void main(String[] args) {
        int m=3;
        int arr[][] = new int[m][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}