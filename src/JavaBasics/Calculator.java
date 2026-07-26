package JavaBasics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition of "+a+" and "+b+" = "+(a+b));
        System.out.println("Subtraction of "+a+" and "+b+" = "+(a-b));
        System.out.println("Multiplication of "+a+" and "+b+" = "+(a*b));
        System.out.println("Division of "+a+" and "+b+" = "+(a/b));
        System.out.println("Modulus of "+a+" and "+b+" = "+(a%b));
        sc.close();
    }
}
