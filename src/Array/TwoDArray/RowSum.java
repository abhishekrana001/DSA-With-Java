package Array.TwoDArray;

//  Problem Statement:-
//  Ek 2D Array (Matrix) diya gaya hai.
//  Tumhe har row ka sum calculate krna karke print karna hai..
//  Example: Row 0 Sum = 6
//           Row 1 Sum = 15
//           Row 2 Sum = 24
public class RowSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[0].length; j++){
                sum = sum + arr[i][j];
            }
            System.out.println("Row " + i + " Sum: " + sum);
        }
    }
}
