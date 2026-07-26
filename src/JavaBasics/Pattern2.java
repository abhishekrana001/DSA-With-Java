package JavaBasics;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int j = 1; j <= number; j++){
            for(int i = j; i <= number; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
