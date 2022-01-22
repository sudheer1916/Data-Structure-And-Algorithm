class KStacksInAnArray {
    int arr[], top[], next[];
    int cap, k ;        //k = number of Stacks 
    int freeTop;

    KStacksInAnArray(int k, int n){
        this.k = k;
        cap = n;
        arr = new int[cap];     //total no of elements stored by the array
        top = new int[k];       //stores the index of top element of respective stack
        next = new int[cap];

        for(int i=0;i<k;i++)
        top[i] = -1;

        freeTop = 0;

        for(int i=0;i<cap-1;i++)
        next[i] = i+1;
        next[cap-1] = -1;
    }
    boolean isFull(){
        return (freeTop == -1);
    }
    boolean isEmpty(int sn){        //sn = stack number
        return (top[sn] == -1);
    }
    void push(int x,int sn){
        if(isFull()){
            System.out.print(" Stack OverFlow ");
            return ;
        }
        int i = freeTop;
        freeTop = next[i];
        next[i] = top[sn];
        top[sn] = i;
        arr[i] = x;
    }
    int pop(int sn){
        if(isEmpty(sn)){
            System.out.print(" Stack UnderFlow ");
            return Integer.MAX_VALUE;
        }
        int i = top[sn];
        top[sn] = next[i];
        next[i] = freeTop;
        freeTop = i;
        return arr[i];
    }

    public static void main(String[] args) {
        int k = 3,n = 10;
        KStacksInAnArray ks = new KStacksInAnArray(k,n);

        ks.push(15, 2);
        ks.push(45, 2);

        ks.push(17, 1);
        ks.push(49, 1); 
        ks.push(39, 1); 
       
        ks.push(11, 0); 
        ks.push(9, 0); 
        ks.push(7, 0); 

        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1)); 
        System.out.println("Popped element from stack 0 is " + ks.pop(0));   
    }
}
