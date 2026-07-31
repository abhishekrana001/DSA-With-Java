package Array.TwoDArray;

import static java.lang.Integer.MIN_VALUE;

public class FindLargestElement {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int large = MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] > large){
                    large = arr[i][j];
                }
            }
        }
        System.out.println("Largest Element is: " + large);
    }
}
