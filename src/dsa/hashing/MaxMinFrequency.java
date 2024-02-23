package dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxMinFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int arr[] = getFrequencies(nums);
        System.out.println("Result is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] getFrequencies(int []v) {
        int temp = 0; //temp
        int minFrequency = Integer.MAX_VALUE;
        int g = Integer.MAX_VALUE;
        int k = Integer.MAX_VALUE;
        int a[] = new int[2]; //for result
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i <= v.length-1 ;i++) {
            if(map.containsKey(v[i])) {
                map.put(v[i], map.get(v[i])+1);
            }else {
                map.put(v[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if(entry.getValue() > temp || entry.getValue() == temp && g>entry.getKey()) {
                temp = entry.getValue();
                g = entry.getKey();
                a[0] = g;
            }
            if (entry.getValue() < minFrequency || (entry.getValue() == minFrequency && entry.getKey() < k)) {
                minFrequency = entry.getValue();
                k = entry.getKey();
                a[1]=k;
            }
        }
        return a;
    }
}