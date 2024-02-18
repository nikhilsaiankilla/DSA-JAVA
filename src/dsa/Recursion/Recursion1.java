package dsa.Recursion;

import java.util.Scanner;

public class Recursion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to print and name");
        String arr[] = printingName(sc.nextInt(),sc.next());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static String[] printingName(int x,String name){
        String arr[] = new String[x];
        return printNameUsingRecursion(5,name,arr);
    }

    public  static  String[] printNameUsingRecursion(int n,String name,String arr[]){
        if (n >= 1){
            arr[n - 1] = name;
            printNameUsingRecursion(n - 1 , name , arr);
        }
        return arr;
    }
}
