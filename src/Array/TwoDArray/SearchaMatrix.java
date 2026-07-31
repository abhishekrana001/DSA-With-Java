package Array.TwoDArray;


//  Problem Statement
//
//Ek matrix di gayi hai jisme:
//
//Har row left se right sorted hai.
//Har column top se bottom sorted hai.
//
//Target diya hai.
//
//Agar target mil jaye to true, warna false.

public class SearchaMatrix {
    public static boolean search(int[][] arr, int target) {

        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {

            if (arr[row][col] == target) {
                return true;
            }

            if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println(search(arr, 5));   // true
        System.out.println(search(arr, 20));  // false
    }
}
