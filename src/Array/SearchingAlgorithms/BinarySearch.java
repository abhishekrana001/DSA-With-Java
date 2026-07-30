package Array.SearchingAlgorithms;

//Binary Search ek searching algorithm hai
// jo sorted array me kisi element ko efficiently
// search karta hai by repeatedly dividing the search space into two halves.

public class BinarySearch {
    public static int BinSearch(int[] arr, int target) {
        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {2 ,5 ,8 ,12, 18, 25 ,30 ,36 ,42 ,50};
        int target = 8;

        System.out.println("Target Index is: " +  BinSearch(arr, target));
    }
}
