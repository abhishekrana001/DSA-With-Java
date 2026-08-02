package Strings.BasicProgram;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int n = s.length();
        for(int i = n-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
        input.close();
    }
}
