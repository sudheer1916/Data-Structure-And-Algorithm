import java.util.Stack;

//Largest Rectangular Area in a Histogram 
//for prevSmaller array, we use -1 if the prev smaller does not exist
//for nextmaller array, we used sizeOfArray(not possible) if the next Smaller does not exist
class LargestRectangularArea {
    /*static int getMaxArea(int arr[],int n){     //naive theta(n^2)
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for(int j = i-1;j >= 0;j--){
                if(arr[j] >= arr[i])
                curr += arr[i];
                else break;
            }
            for(int j = i+1;j<n;j++){
                if(arr[j] >= arr[i])
                curr += arr[i];
                else break;
            }
            res = Math.max(res, curr);
        }
        return res;
    }*/

    /*static int getMaxArea(int arr[],int n){     //better O(n)
        int res = 0;
        int ps[] = new int[n];  //Array for storing indexies of previous small
        int ns[] = new int[n];  //Array for storing indexies of next small
        Stack<Integer> s = new Stack<>();   //we maintan index not actual item 

        //start of finding previous smaller method
        s.add(0);       //pushes index 0 into stack
        for(int i=0;i<n;i++){
            while (s.isEmpty() == false && arr[s.peek()] >= arr[i]) {
            //pop the largest element, bcoz we want nearest smaller element's indes
            s.pop();
            }
            int pse = s.isEmpty() ? -1:s.peek();
            ps[i] = pse;
            s.push(i);
        } 
        //end of finding previous smaller method

        while (s.isEmpty() == false) {   
            s.pop();        //removes all elements from stack
        }

        //start of finding next smaller method
        s.push(n-1);    //pushes index of last element into stack 
        for(int i=n-1;i>0;i++){
            while (s.isEmpty() == false && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            int nse = s.isEmpty() ? n:s.peek();
            ns[i] = nse;
            s.push(i);
        }
        //end of finding next smaller method

        for(int i=0;i<n;i++){
            int curr = arr[i];
            curr+=(i-ps[i]-1)*arr[i];
            curr+=(ns[i]-i-1)*arr[i];
            res = Math.max(res, curr);
        }
        return res;
    }*/

    static int getMaxArea(int arr[],int n){       //efficient 
        Stack<Integer> s = new Stack<>();       //stores indexies
        int res = 0;
        int tp;
        int curr;
        for(int i=0;i<n;i++){
            while (s.isEmpty() == false && arr[s.peek()] >= arr[i]) {
                tp = s.peek();
                s.pop();
                curr = arr[tp]*(s.isEmpty() ? i:(i-s.peek()-1) );
                res = Math.max(res, curr);
            }
            s.add(i);
        }
        while (s.isEmpty() == false) {
            tp = s.peek();
            s.pop();
            curr = arr[tp]*( s.isEmpty() ? n:(n-s.peek()-1) );
            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{6,2,5,4,1,5,6};
        
        System.out.print("Maximum Area: "+getMaxArea(arr,arr.length));
    }
}
