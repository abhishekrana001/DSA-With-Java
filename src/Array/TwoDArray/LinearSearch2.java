package Array.TwoDArray;

//  Problem Statement:-
//  Ek 2D Array (Matrix) aur ek target element diya gaya hai.
//  Tumhe check karna hai ki target matrix me present hai ya nahi.
//  Agar present hai to uska:
//  Row Index
//  Column Index
//  return karo.

//  Agar present nahi hai to:
//  [-1, -1]
//return karo.

public class LinearSearch2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 18;
        int row = -1;
        int col = -1;
        for(int j = 0; j < arr[0].length; j++){
            for(int k = 0; k < arr.length; k++){
                if(arr[k][j] == target){
                    row = k;
                    col = j;
                }
            }
        }
        System.out.println("Row :" + row);
        System.out.println("Col :" + col);
    }
}
