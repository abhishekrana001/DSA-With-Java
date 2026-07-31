package Array.TwoDArray;

//  Question : Search in Sorted Matrix (LeetCode 74)

//  Problem Statement:-

//  Ek matrix di gayi hai jisme:
//  Har row sorted hai.
//  Har row ka pehla element, pichhli row ke last element se bada hai.
//  Tumhe ek target diya jayega.

//  Return:
//  true → agar target mil jaye.
//  false → agar target na mile.

public class SearchSortedMatrix {
    public static boolean search(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
    public static void main(String[] args) {

        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 16;

        System.out.println(search(arr, target));
    }
}
