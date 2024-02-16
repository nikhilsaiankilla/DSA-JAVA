package dsa.basicMath;

import java.util.Scanner;

public class SumOfDivisors {
    public static int sumOfAllDivisors(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    sum += j;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumOfAllDivisors(3));
    }
}
