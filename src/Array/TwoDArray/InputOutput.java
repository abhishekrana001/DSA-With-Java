package Array.TwoDArray;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Element in the array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Inter the Element in the "+ (i + 1) +" row :");
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output the Element in the array: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
