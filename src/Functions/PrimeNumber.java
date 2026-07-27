package Functions;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean prime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        if(prime(n)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
        input.close();
    }
}
