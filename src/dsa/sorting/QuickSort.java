package dsa.sorting;

public class QuickSort {
    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partitionIndex = partition(input, startIndex, endIndex);
            quickSort(input, startIndex, partitionIndex - 1);
            quickSort(input, partitionIndex + 1, endIndex);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (j >= i && arr[j] >= pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10, 6, 9};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
