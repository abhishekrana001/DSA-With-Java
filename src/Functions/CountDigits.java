package Functions;

import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int number){
        int count = 0;
        while(number!=0){
            count++;
            number = number/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Count of Digits is: " + countDigits(number));
        input.close();
    }
}
