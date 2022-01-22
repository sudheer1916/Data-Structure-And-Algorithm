class SquareRoot {
    static int sqroot(int n){                    //efficient O(log n)
        int low = 1,high = n,ans = -1;
        while (low<=high) {
            int mid = (low+high)/2;
            int sqmid = mid * mid;
            if(sqmid == n)
            return mid;
            else if(sqmid>n)
            high = mid -1;
            else{
                low = mid + 1;
                ans = mid;
            }
        } 
        return ans;
    }
    /*static int sqroot(int x)            //naive method O(sqrt(n))
	{
		int i = 1;
        while(i * i <= x)
			i++;
		return i - 1;
	}*/

    public static void main(String[] args) {
        int x = 21;
        System.out.println(sqroot(x));
    }
}
