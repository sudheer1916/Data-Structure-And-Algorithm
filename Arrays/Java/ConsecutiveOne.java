class ConsecutiveOne {
    static int ones(int arr[]){                  //efficient O(n)
        int count = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                res = Math.max(res, count);
            }    
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,1,0,1,1,1};
        System.out.println("maximum consecutive 1's are "+ones(arr));
    }    
}

