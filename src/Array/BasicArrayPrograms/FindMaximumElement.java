package BasicArrayPrograms;

import java.util.Scanner;

public class FindMaximumElement {
    public static int maximumElement(int[] array) {
        int maximum = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > maximum){
                maximum = array[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum element is: " + maximumElement(arr));
    }
}
