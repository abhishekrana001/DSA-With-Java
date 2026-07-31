package Array.TwoDArray;

// Problem Statement:-

// Ek matrix di gayi hai.
// Agar kisi cell ki value 0 hai,
// to uski poori row aur poora column ko 0 bana do.

public class SetMatrixZeroes {

    public static void setZeroes(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        // Step 1: Mark rows and columns containing 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: Set elements to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (row[i] || col[j]) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        setZeroes(arr);

        printMatrix(arr);
    }
}
