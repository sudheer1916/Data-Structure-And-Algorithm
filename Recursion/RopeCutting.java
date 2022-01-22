class RopeCutting {
    static int cutting(int n,int a,int b,int c){
        if(n==0)
        return 0;
        if(n<0) return -1;

        int res = Math.max(cutting(n-a, a, b, c), 
                           Math.max(cutting(n-b, a, b, c),
                                    cutting(n-c, a, b, c))
                          );

        if(res == -1)
        return -1;
        return res+1;                         
                           
    }
    public static void main(String[] args) {
        System.out.println(cutting(23, 11, 12, 9));
        System.out.println(cutting(9, 2, 2, 2));
        System.out.println(cutting(5, 1, 2, 5));
    }
}
