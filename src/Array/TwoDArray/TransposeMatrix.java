package Array.TwoDArray;

//  Problem Statement:-
//  Ek matrix di gayi hai.
//  Tumhe uska Transpose Banana hai..

//  Transpose Means:-
//  Rows ko Column me aur Columns ko Rows me convert karna .

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr[i].length; j++){
                int  temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
