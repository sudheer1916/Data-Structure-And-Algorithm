import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
class Triplet implements Comparable<Triplet>{
    int val,aPos,vPos;
    Triplet(int v,int ap,int vp){
        val = v;
        aPos = ap;
        vPos = vp;
    }
    public int compareTo(Triplet t){
        if(val<=t.val) return -1;
        else return 1;
    }
}
class MergeKSortedArrays1 {         //efficient  //O(nklogk)
    static List<Integer> mergeArr(ArrayList<ArrayList<Integer>> arr){
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.size(); i++) {
            pq.add(new Triplet(arr.get(i).get(0), i, 0));
        }
        while (pq.isEmpty() == false) {
            Triplet curr = pq.poll();
            res.add(curr.val);
            int ap=curr.aPos;
            int vp=curr.vPos;
            if(vp+1<arr.get(ap).size())
                pq.add(new Triplet(arr.get(ap).get(vp+1), ap, vp+1));
        }
        return res;
    }

    public static void main(String[] args) {
        //ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
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

        List<Integer> res = mergeArr(arr);
        System.out.println("merged arrays are : ");
        for(int x:res)
        System.out.print(x+" ");
    }
}
