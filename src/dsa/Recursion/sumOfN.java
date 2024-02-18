package dsa.Recursion;

public class sumOfN {
    public static long sumFirstN(long n) {
        return sumOfN(n,0);
    }

    public static long sumOfN(long n,long sum ){
        if(n >= 1){
            return sumOfN(n - 1, sum + n);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstN(3));
    }
}
