package dsa.Recursion;

import java.util.Scanner;

public class PrintingDigits {
    public static int[] printNos(int x) {
        int arr[] = new int[x];
        return addElement(x, arr);
    }

    public static int[] addElement(int n, int arr[]) {
        if (n >= 1) {
            arr[n - 1] = n;
            return addElement(n - 1, arr);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = printNos(3);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
