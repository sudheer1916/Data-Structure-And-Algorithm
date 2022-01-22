//lookup table algorithm
class CountSet1 {
    static int []table = new int[256];
	
	// recursive function to count set bits 
	public static void initialize() { 

      // To initially generate the table algorithmically:
      table[0] = 0;
      for (int i = 0; i < 256; i++)
      {
          table[i] = (i & 1) + table[i / 2];
      }
	} 
    int fun(int n){
        return table[n & 0xff] + 
        table[(n >> 8) & 0xff] + 
        table[(n >> 16) & 0xff] + 
        table[n >> 24];
    }
}
class CountSet1Main{
    public static void main(String[] args) {
        CountSet1 obj = new CountSet1();
        CountSet1.initialize();
        System.out.println("result = "+ obj.fun(43));

    }
}
