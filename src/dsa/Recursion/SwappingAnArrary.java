package dsa.Recursion;

public class SwappingAnArrary {
    public static int[] reverseArray(int n, int[] nums) {
        return reversingArray(nums, 0, n - 1);
    }

    public static int[] reversingArray(int[] arr, int l, int r) {
        if (l >= r) {
            return arr;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return reversingArray(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int resultArray[] = reverseArray(arr.length,arr);
        for (int i = 0; i < resultArray.length ; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
