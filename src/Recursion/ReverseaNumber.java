package Recursion;

public class ReverseaNumber {
    public static void reverse(int rev, int n){
        if(n==0){
            System.out.println(rev);
            return;
        }
        int lastdigit = n % 10;
        rev = rev * 10 + lastdigit;
        reverse(rev,n/10);
    }

    public static void main(String[] args) {
        int n = 12345;
        reverse(0, n);
    }
}
