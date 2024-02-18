package dsa.Recursion;

import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i = 1;
        int arr1[] = printNos(n,arr,i);

        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }
    }

    public static int[] printNos(int n,int arr[],int currentVal){
       if(currentVal <= n){
           arr[currentVal - 1] = currentVal;
           return  printNos(n,arr,currentVal + 1);
       }
       return arr;
    }
}
