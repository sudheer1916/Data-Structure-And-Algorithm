import java.util.*;
class FrequenciesOfElements {
    //efficient O(n)
    static void countFreq(int arr[],int n){
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            //int key = arr[i];
            if(mp.containsKey(arr[i]) == true)
            mp.put(arr[i], mp.get(arr[i])+1);
            else
            mp.put(arr[i],1);
        }
        /*for (int i : arr) {
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }*/

        for(Map.Entry<Integer,Integer> itr:mp.entrySet())
        System.out.println(itr.getKey()+" "+itr.getValue());
    }
    public static void main(String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;  
        countFreq(arr, n);
    }
}
