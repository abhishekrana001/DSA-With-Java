package JavaBasics;

import java.util.Scanner;

// Prime number is a number that is divisible only by 1 and itself.
// Example :- 2, 3, 5, 7, 11, 13 , ...
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Boolean isPrime = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        }else  {
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
}
