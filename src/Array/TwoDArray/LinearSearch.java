package Array.TwoDArray;


//  Linear Search in 2D Array

//  Problem Statement:

//  Ek 2D array aur ek target diya hoga.
//  Tumhe batana hai ki target matrix me present hai ya nahi.
//  Agar present hai to uski row aur column return karni hai.

public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int target = 80;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    System.out.println("Found at Row = " + i + ", Column = " + j);
                }
            }
        }
    }
}
