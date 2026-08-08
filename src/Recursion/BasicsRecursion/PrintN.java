package Recursion.BasicsRecursion;

public class PrintN {
    public static void print(int current, int n){
        if(current > n){
            return;
        }
        System.out.println(current);

        print(current+1, n);
    }

    public static void main(String[] args) {
        int n =5;
        print(1, n);
    }
}
