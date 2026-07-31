package Array.TwoDArray;


// 2D Array:- 2D Array data ko Rows aur Columns me store karta hai.
// Examples :-         Column
    //          0   1   2
    //
    //  Row 0  10  20  30
    //
    //  Row 1  40  50  60
    //
    //  Row 2  70  80  90

public class IntroTo2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {60, 70, 80}
        };

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
