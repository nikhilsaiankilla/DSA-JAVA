package dsa.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        System.out.println("Enter unsorted elements in array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n-1);

        System.out.println("Sorted array is ");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void mergeSort(int arr[],int low,int high){
       if(low >= high) return;
       int mid = (low + high) / 2;
       mergeSort(arr,low,mid);
       mergeSort(arr,mid + 1,high);
       merge(arr,low,mid,high);
    }
    public static void merge(int arr[],int low,int mid,int high){
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) { // Note the change in comparison (<= instead of >=)
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Copy remaining elements from left subarray
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Copy remaining elements from right subarray
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy sorted elements back to original array
        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }
    }
}
