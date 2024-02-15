package dsa.basicMath;
import java.util.Scanner;

public class Armstrong {
    public static boolean armstrong(int n){
        int originalnum = n ;
        int count = 0;
        int temp = n;
        while(temp!=0){
            count++;
            temp = temp/10;
        }
        int sum = 0;
        while(n!=0){
            int digit = n %10;
            sum += Math.pow(digit,count);
            n/=10;
        }
        return (sum == originalnum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrong(n));
    }
}
