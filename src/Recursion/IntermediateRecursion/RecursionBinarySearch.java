package Recursion.IntermediateRecursion;

public class RecursionBinarySearch {
    public static int index(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return index(arr, left, mid - 1, target);
        }
        return index(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int left = 0;
        int right = arr.length-1;

        System.out.println(index(arr, left, right, target));
    }
}
