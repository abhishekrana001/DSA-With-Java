package BasicArrayPrograms;

import java.util.Scanner;

public class FindSumOfElement {
    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }

        System.out.println("Sum of the array is: " + sum(array));
    }
}
