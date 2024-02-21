package dsa.Recursion;

public class Fibonacci {
    public static int[] generateFibonacciNumbers(int n) {
        if (n <= 0) {
            return new int[0]; // Return an empty array for n <= 0
        } else if (n == 1) {
            return new int[]{0}; // Return an array with a single element 0 for n == 1
        } else {
            int[] fib = new int[n];
            fibonacci(fib, 0, n);
            return fib;
        }
    }
    public static void fibonacci(int[] fib, int index, int n) {
        if (index < n) {
            if (index == 0) {
                fib[index] = 0;
            } else if (index == 1) {
                fib[index] = 1;
            } else {
                fib[index] = fib[index - 1] + fib[index - 2];
            }
            fibonacci(fib, index + 1, n);
        }
    }

    public static void main(String[] args) {
        int arr[] = generateFibonacciNumbers(10);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
