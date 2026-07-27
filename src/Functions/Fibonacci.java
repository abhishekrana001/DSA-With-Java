package Functions;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series is : ");
        for(int i = 1; i <= n; i++){
            int c = a + b;
            System.out.print( a + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = input.nextInt();
        fibonacci(n);
        input.close();
    }
}
