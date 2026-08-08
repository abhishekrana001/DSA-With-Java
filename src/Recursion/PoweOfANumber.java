package Recursion;

public class PoweOfANumber {
    public static int power(int base, int power){
        if(power == 0){
            return 1;
        }
        return base * power(base, power-1);
    }

    public static void main(String[] args) {
        int base = 2;
        int power = 5;
        System.out.println(power(base, power));
    }
}
