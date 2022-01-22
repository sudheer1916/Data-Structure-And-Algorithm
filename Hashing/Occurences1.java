import java.util.HashMap;
import java.util.Map;

//solution for prblm if n is very large and k is small
//better solution then previous
//no of elements in the output <= k-1
/*based on Boyer-Moore Majority Voting Algorithm :-
    Step 1 – Find a candidate with the majority
    Step 2 – Check if the candidate has more than N/k */
    
class Occurences1 {                //efficient  O(nk)

    static void printNByK(int arr[],int n,int k){
        //part-1
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            
            if(m.containsKey(arr[i])){
                int value = m.get(arr[i]);
                m.put(arr[i], value+1);
            }
            else if(m.size()<k-1)
            m.put(arr[i], 1);
            
            else{
            for(Map.Entry<Integer,Integer> x : m.entrySet()){
                m.put(x.getKey(), x.getValue()-1);
                if(x.getValue() ==0)
                m.remove(x.getKey());
            }
            }
        }
        //part-2
        for(Map.Entry<Integer,Integer> x : m.entrySet()){
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(x.getKey() == arr[i])
                count++;
            }
            if(count > n/k)
            System.out.print(x.getKey()+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = new int[]{30, 10, 20, 20, 20, 10, 40, 30, 30};       
        int n = arr.length;
        int k=4;
        printNByK(arr, n, k);
    }
}
