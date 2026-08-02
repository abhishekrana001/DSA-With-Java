package Strings.BasicProgram;

import java.util.Scanner;

public class FindLengthofString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("The length of the string is: " + s.length());
        input.nextLine();
    }
}
