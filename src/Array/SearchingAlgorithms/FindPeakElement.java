package Array.SearchingAlgorithms;
// Question: Find Peak Element (LeetCode 162)

// Problem Statement:-
// Ek integer array diya hai.
// Peak Element wo hota hai jo apne dono neighbors se bada ho.
// Return kisi bhi ek peak element ka index.
// Agar multiple peak hain, to kisi ek ka index return kar sakte ho.

public class FindPeakElement {
    public static int findPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};

        System.out.println("Peak Element is: " + findPeak(arr));
    }
}
