package dsa.basicMath;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(palindromeNumber(121));
    }
    public static boolean palindromeNumber(int n){
        int reverse = 0;
        int ActualValue = n;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        if (ActualValue == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
