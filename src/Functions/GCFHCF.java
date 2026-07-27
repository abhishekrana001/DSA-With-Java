package Functions;

import java.util.Scanner;


// DRY Run

//   a = 12
//   b = 18

//  Iteration 1
//   temp = 18
//   b = 12 % 18 = 12
//   a = 18

//  Iteration 2
//   temp = 12
//   b = 18 % 12 = 6
//   a = 12

//  Iteration 3
//   temp = 6
//   b = 12 % 6 = 0
//   a = 6

//Answer = 6

public class GCFHCF {

     // Brute Force Approach

    // Time Complexity: O(min(a, b))
    // Space Complexity: O(1)
    public static int gcd(int a, int b) {

        int gcd = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    // Euclidean Algorithm
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(1)

    public static int gcdEuclidean(int a, int b) {

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter b number: ");
        int b = input.nextInt();

        System.out.println("GCD & HCF of " + a + " and " + b + " is: " + gcdEuclidean(a,b));
        input.close();
    }
}
