import java.util.Arrays;

class MeetingMaximumGuests {
//you need to find the time to go to the pary so that you can meet maximum people.
//based on mergesort                //efficient O(n*logn)
    static int maxGuest(int arr[],int dep[]){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,res=1,count=1;
        while (i<arr.length && j<dep.length) {
            if (arr[i]<dep[j]) {
                i++;
                count++;
            } else {  //dep[j]>arr[i]
                j++;
                count--;
            }
            res = Math.max(res, count);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 900, 600, 700};
        int dep[] = { 1000, 800, 730};
        System.out.print(maxGuest(arr,dep));
    }
}
