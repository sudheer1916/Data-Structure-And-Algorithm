import java.util.HashSet;
import java.util.Set;

class InterSection {            //efficient theta(m+n)
    static int intersection(int arr1[],int arr2[]){
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        hs.add(arr1[i]);
        int res=0;
        for (int i = 0; i < arr2.length; i++) {
            if(hs.contains(arr2[i])){
                res++;
                hs.remove(arr2[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr1[] = new int[]{15, 17, 27, 27, 28, 15};
        int arr2[] = new int[]{16, 17, 28, 17, 31, 17};
        System.out.println(intersection(arr1,arr2));
    }
}
