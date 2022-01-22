/*Consider an arrangement where n petrol pumps are arranged in a circular manner. 
We need to find the first petrol pump from where we can visit all petrol pumps and 
come back to the petrol pump without ever going out of the petrol.
*/
class FirstCircularTour {
    /*static int firstPetrolPump(int[] p,int[] d){    //naive O(n^2)
        for(int start=0;start<p.length;start++){
            int currPetrol = 0;
            int end = start;
            while (true) {
                currPetrol += (p[end] - d[end]);
                if(currPetrol <0)
                break;
                end = (end+1)%p.length;
                if(end == start)
                return start+1;
            }
        }
        return -1;
    }*/
    static int firstPetrolPump(int[] p,int[] d){    //efficient O(n)
        int start = 0;                              //one traversal
        int currPetrol = 0,prevPetrol = 0;          //array solution 
        for (int i = 0; i < p.length; i++) {
            currPetrol += (p[i] - d[i]);
            if(currPetrol < 0){
                start = i+1;
                prevPetrol += currPetrol;
                currPetrol = 0;
            }
        }
        return ((currPetrol+prevPetrol)>=0) ? start+1 : -1;
    }
    public static void main(String[] args) {
        int[] petrol = {4,8,7,4};
        int[] dist = {6,5,3,5};
        System.out.println(firstPetrolPump(petrol,dist));
    }
}
