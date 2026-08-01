package Array.ExtraQuestions;

public class DiagonalTraversal {

    public static void main(String[] args) {
        int[][] arr = {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19},
        };
        for(int g = 0; g < arr.length; g++){
            for(int i = 0, j = g; j < arr[0].length; i++, j++){
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}
