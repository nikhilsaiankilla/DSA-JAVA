package dsa.Recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(233));
    }
    public static boolean isPowerOfTwo(int n) {
        return checkIsPowerOfTwo(n,0);
    }
    public static boolean checkIsPowerOfTwo(double n,double x){
        double power = Math.pow(2,x);
        if(power == n){
            return true;
        }
        if(power > n){
            return false;
        }
        return checkIsPowerOfTwo(n,x+1);
    }
}
