package Functions;

import java.util.Scanner;

public class EvenOddNum {
    public static boolean num(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(num(n)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        input.close();
    }
}
