package dsa.hashing;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Declaring the hash array");
        int hash [] = new int[12];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }
        while (true){
            System.out.println("Enter the element");
            int number = sc.nextInt();
            System.out.println(hash[number] + " ");
        }
    }
}
