package JavaBasics;

// Rotate Number ek process hai jisme kisi number ke
// digits ko left ya right direction me circular shift (rotate)
// kiya jata hai, bina kisi digit ko remove kiye.

// Example:- Number = 12345,  Rotate by = 2
// Solution:- 1st rotation: 12345 -> 51234. 2nd rotation: 51234 -> 45123

import java.util.Scanner;

public class RotateNnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter a number of rotation: ");
        int k = sc.nextInt();
        int nod = 0;
        int temp = num;

        while(num >0){
            nod++;
            num /= 10;
        }

        k = k % nod;

        if(k < 0){
            k += nod;
//            yh negative rotation krne ke liya hai...
        }
        int mult = 1;
        int div = 1;

        for(int i = 1; i <= nod; i++){
            if(i<=k){
                div = div * 10;
            }else{
                mult = mult * 10;
            }
        }
        int q = temp % div;
        int rem = temp / div;
        int result = q * mult + rem;
        System.out.println("Result :" + result);


        sc.close();
    }
}
