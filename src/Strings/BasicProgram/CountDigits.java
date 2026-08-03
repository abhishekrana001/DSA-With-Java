package Strings.BasicProgram;

public class CountDigits {
    public static int digits(String s) {
        int count = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Abhi123";
        System.out.println("Couont of digits in string is: " + digits(s));
    }
}
