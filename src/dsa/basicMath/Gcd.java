package dsa.basicMath;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(calcGCD(54,32));
    }
    public static int calcGCD(int n, int m){
        while(n > 0 && m > 0){
            if(n > m ){
                n = n % m;
            }else{
                m = m % n;
            }
        }
        if(n==0){
            return m;
        }
        return n;
    }
}
