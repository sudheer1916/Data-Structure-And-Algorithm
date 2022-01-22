import java.util.ArrayList;
//import java.util.Collections;

class Pair1{
    Integer key;
    Integer value;
    Pair1(Integer key,Integer value){
        this.key = key;
        this.value = value;
    }
}
public class MergeKSortedArrays {
    /*static ArrayList<Integer> mergeKArrays(ArrayList<ArrayList<Integer>> arr){
        ArrayList<Integer> res = new ArrayList<>();
        for(ArrayList<Integer> i: arr){     //super naive solution
            for(Integer j : i)              //(nklognk)
            res.add(j);            //method1, using sort function
        }
        Collections.sort(res);      //nlogn
        return res;
    }*/

    static ArrayList<Integer> mergeArrays(ArrayList<Integer> arr1,
                                          ArrayList<Integer> arr2)
    {
        int i=0,j=0;
        ArrayList<Integer> arr3 = new ArrayList<>();
        while (i<arr1.size() && j<arr2.size()) {
            if(arr1.get(i) < arr2.get(j))
            arr3.add(arr1.get(i++));
            else
            arr3.add(arr2.get(j++));
        }
        while (i<arr1.size()) {
            arr3.add(arr1.get(i++));
        }
        while (j<arr2.size()) {
            arr3.add(arr2.get(j++));
        }
        return arr3;
    }
    //this method2 uses merge function of mergeSort Algorithm   O(m+n )
    static ArrayList<Integer> mergeKArrays(ArrayList<ArrayList<Integer>> arr){
        ArrayList<Integer> res = arr.get(0);    //method2 naive
        for(int i = 1;i<arr.size();i++){        //O(nk^2)
            res = mergeArrays(res,arr.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);

        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(5);
        a2.add(15);

        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(1); 
        a3.add(9); 
        a3.add(11);
        a3.add(18);

        arr.add(a1);
        arr.add(a2);
        arr.add(a3);

        ArrayList<Integer> res = mergeKArrays(arr);
        System.out.println("merged arrays are : ");
        for(int x:res)
        System.out.print(x+" ");
    }
}

