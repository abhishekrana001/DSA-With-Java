package Array.TwoDArray;

//  Problem Statement:-
//  Ek N × N matrix di gayi hai.
//  Usse 90° Clockwise Rotate karo.
//  Condition: Extra matrix use nahi karni (In-place).

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr[i].length; j++){
                int  temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++){
            int left = 0;
            int right = arr.length - 1;
            while(left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }


        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
