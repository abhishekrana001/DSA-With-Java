package Array.TwoDArray;

//  Problem Statement:-
//  Ek 2D Array (Matrix diya gaya hai.
//  Tumhe har column ka sum calculate karke print karna hai..

//  Example:-

//  Column 0 Sum = 12
//  Column 1 Sum = 15
//  Column 2 Sum = 18
public class ColumnSum {
    public static void main(String[] args) {
         int[][] arr = {
                 {1,2,3},
                 {4,5,6},
                 {7,8,9}
         };
         for(int i=0; i<arr[0].length; i++){
             int sum = 0;
             for(int j=0; j<arr.length; j++){
                 sum += arr[j][i];
             }
             System.out.println("Column " + i + " Sum: " + sum);
         }
    }
}
