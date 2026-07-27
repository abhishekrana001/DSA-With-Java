package Functions;

import java.util.Scanner;

public class Frequency {
    public static int frequency(int number, int find) {
        int freq = 0;

        while(number != 0) {
            int digit = number % 10;
            number = number / 10;
            if(digit == find) {
                freq++;
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Enter a digit to find : ");
        int find = input.nextInt();

        System.out.println("Frequency of " + find + " is: " + frequency(number, find));
        input.close();
    }
}
