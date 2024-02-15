package dsa.basicMath;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countDigits(336));
    }
    public static int countDigits(int n) {
        int i = 0;
        int actualNthValue = n;
        while (n > 0) {
            int lastDigit = n % 10;
            try {
                if(actualNthValue % lastDigit == 0){
                    i++;
                }
            } catch (ArithmeticException e) {
                n = n / 10;
                continue;
            }
            n = n / 10;
        }
        return i;
    }
}
