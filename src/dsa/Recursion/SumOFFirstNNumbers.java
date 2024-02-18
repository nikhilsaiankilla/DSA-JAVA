package dsa.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SumOFFirstNNumbers {
    public static List<Long> factorialNumbers(long n) {
        long i = 1;
        List<Long> list = new ArrayList<>();
        return Number(list, n, i);
    }

    public static List<Long> Number(List<Long> list, long n, long i) {
        if (fact(i) > n) {
            return list;
        }
        list.add(fact(i));
        return Number(list, n, i + 1);
    }

    public static long fact(long i) {
        if (i == 1 || i == 0) {
            return 1;
        } else {
            return fact(i - 1) * i;
        }
    }

    public static void main(String[] args) {
        List arr = factorialNumbers(7);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
