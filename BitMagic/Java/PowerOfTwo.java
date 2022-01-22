//if the number is the power of 2, then it has only 1 set bit

class PowerOfTwo {
    /*boolean check(int n){               //method1 naive
        if(n==0)
        return false;
        while(n!=1){
            if (n%2!=0)
            return false;
            n=n/2;
        }
        return true;
    }*/

    boolean check(int n){                 //method2 efficient
        /*if (n==0) {
            return false;
        } else {
            return ((n&(n-1))==0);
        }*/

        return n!=0 && ((n&(n-1))==0);

    }
}
class TwoMain{
    public static void main(String[] args) {
        PowerOfTwo obj = new PowerOfTwo();
        System.out.println(obj.check(128));
        
    }
}
