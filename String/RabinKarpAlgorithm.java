class RabinKarpAlgorithm{
    //efficient O((n-m+1)*m)
    static final int d = 256;       //ascii
    static final int q = 101;       //large prime number for modulo function
    static void RBSearch(String pat,String txt){
        int M = pat.length();       
        int N = txt.length();

        //Compute (d^(M-1))%q
        int h=1;                    
        for(int i=1;i<=M-1;i++)
        h=(h*d)%q;

        //hashvalue of current window of text
        //Compute p and t0
        //compute pattern hash function and txt hash function for 1st window
        int p=0,t=0;
        for (int i = 0; i < M; i++) {
            p=(p*d+pat.charAt(i))%q;
            t=(t*d+txt.charAt(i))%q;
        }

        for (int i = 0; i <= (N-M); i++) {
            //Check for spurious hit
            if(p==t){              //hashcode of pattern == txt
                boolean flag = true;
                for (int j = 0; j < M; j++) {
                    if(txt.charAt(j) != pat.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag == true)
                    System.out.print(i+" ");
            }
            //compute rolling hash
            //Compute ti+1 using ti
            if(i<(N-M)){
                //t(i+1) = d*(t(i) - t*t[i]*d^(m-1)) + t*t[i+m]
                t = ((d*(t-txt.charAt(i)*h))+txt.charAt(i+M))%q;
                if(t<0)
                t=t+q;
            }
        } 
    }
    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat="GEEK";
        System.out.print("All index numbers where pattern found: ");
        RBSearch(pat,txt);
    }
}