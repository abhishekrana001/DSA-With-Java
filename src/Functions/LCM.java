package Functions;

import java.util.Scanner;

// LCM = (a × b) / GCD(a, b)
public class LCM {
    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter b number: ");
        int b = sc.nextInt();
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a,b));
        sc.close();
    }
}
