package Strings.BasicProgram;

import java.util.Scanner;

public class PrintCharactersofaString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        for(char c : s.toCharArray()){
            System.out.println(c);
        }


        input.nextLine();
    }
}
