package JavaBasics;

// An Armstrong Number is a number that is equal to the sum of its own digits,
// where each digit is raised to the power of the total number of digits in the number.

import java.util.Scanner;

// Example :- Number = 153
//  Number of digits = 3
//  Calculation :-  1³ + 5³ + 3³ = 1 + 125 + 27 = 153
public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int digits = 0;

        while( temp != 0 ){
            digits++;
            temp = temp / 10;
        }

        temp = num;

        while(temp!=0){
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp = temp/10;
        }

        if(num == sum){
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not Armstrong number");
        }
        sc.close();
    }
}
