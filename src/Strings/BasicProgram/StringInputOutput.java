package Strings.BasicProgram;

import java.util.Scanner;

public class StringInputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("You entered this string: " + s);
        input.close();
    }
}
