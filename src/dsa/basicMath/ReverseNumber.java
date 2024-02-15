package dsa.basicMath;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverseBits(4));
    }
    public static long reverseBits(long n) {
        long result = 0;
        for(int i=0;i<32;i++){
            result <<= 1;
            if((n & 1)==1){
                result++;
            }
            n >>=1;
        }
        return result;
    }
}
