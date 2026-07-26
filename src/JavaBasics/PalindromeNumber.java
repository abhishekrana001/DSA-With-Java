package JavaBasics;

import java.util.Scanner;

// A Palindrome Number is a number that remains the same when its digits are reversed.
// Example:- 121
public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reversedNumber = 0;
        int temp = number;

        while(number > 0){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit ;
            number = number / 10;
        }

        if(reversedNumber == temp){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not Palindrome number");
        }
        sc.close();
    }
}
