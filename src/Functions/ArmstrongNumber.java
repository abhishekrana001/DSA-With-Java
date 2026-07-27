package Functions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean checkArmstrongNumber(int number) {
        int sum = 0;
        int temp = number;
        int digits = 0;

        while(temp!=0){
            digits++;
            temp = temp/10;
        }

        temp = number;

        while(temp != 0){
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, digits);
            temp = temp/10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        if(checkArmstrongNumber(n)){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
        input.close();
    }
}
