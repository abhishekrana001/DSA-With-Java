package Functions;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static int convertdecimmaltoanybase(int number, int base) {
        int result = 0;
        int p = 1;
        while (number != 0) {
            int digit = number % base;
            result += digit * p;
            p = p * 10;
            number = number / base;
        }
        return result;
    }

    public static int convertAnybasetoDecimal(int number, int base) {
        int result = 0;
        int p = 1;
        while (number != 0) {
            int digit = number % 10;
            result += digit * p;
            number = number / 10;
            p = p * base;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Enter a base: ");
        int base = input.nextInt();

        System.out.println("Convert :" +  convertdecimmaltoanybase(number, base));
        System.out.println("Convert :" +  convertAnybasetoDecimal(number, base));
    }
}
