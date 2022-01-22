//rules:-
//arraysize >=2
//should contain only one repeating element 
//all the elements from 0 to max(arr) should present 
//eg:- arr[] = {1,2,3,0,3,4,5}  ---> it contains elements from 0 to max(arr)


class RepeatingElement {
    static int repeat(int arr[]){              //efficient O(n)
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < visited.length; i++) {
            if(visited[arr[i]])
            return arr[i];

            visited[arr[i]] = true;
        }
        return -1;
    }
    public static void main(String[] args) {
        //int arr[] = {0, 2, 1, 3, 2, 2};   
        int arr[] = {1,2,3,0,3,4,5};
        System.out.println(repeat(arr));    
    }
}
