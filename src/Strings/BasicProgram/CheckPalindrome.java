package Strings.BasicProgram;

public class CheckPalindrome {
    public static boolean isPalindrome(String s) {
        boolean palindrome = true;
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                palindrome = false;
                break;
            }
            start++;
            end--;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        String s = "madaam";

        if(isPalindrome(s))
            System.out.println("The string is palindrome");
        else
            System.out.println("The string is not palindrome");
    }
}
