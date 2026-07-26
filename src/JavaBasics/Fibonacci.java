package JavaBasics;

import java.util.Scanner;

// Fibonacci Series ek number sequence hai jisme har naya number apne pichle do
// Numbers ka sum hota hai. Ye series 0 aur 1 se shuru hoti hai hai.
// Example :- 0, 1, 1, 2, 3, 5, 8......
public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int a = 0;
        int b = 1;

        for(int i=0; i<n; i++){
            int c = a + b;
            System.out.println(a);
            a = b;
            b = c;

        }
        sc.close();
    }
}
