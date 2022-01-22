class TowerOfHanoi {
    static void fun(int n,char i,char j ,char k){
        if(n==1){
            System.out.println("move 1 from "+ i + " to "+k);
            return;
        }
        fun(n-1,i,k,j);
        System.out.println("move "+n+" from "+i+" to "+k);
        fun(n-1,j,i,k);
    }
    public static void main(String[] args) {
        System.out.println("Tower Of Hanoi ");
        fun(3,'A','B','C');
        System.out.println("---------------------------");
        //fun(4,'A','B','C');
    }
}
//number of movements for a given n = (2^n)-1
