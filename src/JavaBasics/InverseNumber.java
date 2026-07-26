package JavaBasics;

//An Inverse Number is obtained by swapping the positions and
// digits of a number. It is valid only when the number's digits
// form a permutation (each digit from 1 to n appears exactly once).

//       Number = 21453
//
//        10 | 21453 |    3
//        10 | 2145  |    5
//        10 | 214   |    4
//        10 | 21    |    1
//        10 | 2     |    2
//        ------------------------
//
//        id = op
//        ip = od
//------------------------
// | op | od | ip | id        |
// | -- | -- | -- | --------- |
// | 1  | 3  | 1  | 4 × 1     |
// | 2  | 5  | 2  | 5 × 10    |
// | 3  | 4  | 3  | 1 × 100   |
// | 4  | 1  | 4  | 3 × 1000  |
// | 5  | 2  | 5  | 2 × 10000 |
// -------------------------------
// Formula  = id + op * (int)Math.pow(10, od-1)

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int inverseDigit = 0;
        int originalPosition = 1;

        while (num > 0) {
            int originalDigit = num % 10;

            inverseDigit = inverseDigit + originalPosition * (int)Math.pow(10, originalDigit -1);
            num = num / 10;
            originalPosition++;
        }
        System.out.println("The inverse number is " + inverseDigit);
        sc.close();
    }
}
