//left shift occurs similarly for both -ve and +ve numbers
//but for right shift, unsigned int and signed int takes place 
//for right shift if the given number is -ve , we fill the leading digits with 1
//the difference between right shift and unsigned right shift we fill the leading bits with 0 in unsigned
class Shift {
    void fun(){
        System.out.println("left shift = "+ (3<<2));  
        System.out.println("left shift for -ve number = "+ (-2<<2));
        System.out.println("right shift = "+ (33>>2));
        System.out.println("right shift for -ve number = "+ (-2>>1));       //also called signed right shift
        System.out.println("unsigned right shift = "+ (-2>>>1));
    }
}
class ShiftMain{
    public static void main(String[] args) {
        Shift obj = new Shift();
        obj.fun();
    }
}
