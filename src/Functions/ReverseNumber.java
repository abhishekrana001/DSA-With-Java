package Functions;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int number){
        int reversedNumber = 0;
        while (number!=0){
            reversedNumber = reversedNumber * 10 + (number % 10);
            number = number/10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Reverse Number is: " + reverse(number));
        input.close();
    }
}
