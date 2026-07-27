package Functions;

import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtraction(double a, double b) {
        return a - b;
    }
    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) {
        return a / b;
    }
    public static double modulo(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter b number: ");
        int b = input.nextInt();

        System.out.println("Addition of " + a + " and " + b + " is: " + add(a, b));
        System.out.println("Subtraction of " + a + " and " + b + " is: " + subtraction(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " is: " + multiplication(a, b));
        System.out.println("Division of " + a + " and " + b + " is: " + division(a, b));
        System.out.println("Modulo of " + a + " and " + b + " is: " + modulo(a, b));

        input.close();
    }
}
