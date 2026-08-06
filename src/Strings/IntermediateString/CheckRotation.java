package Strings.IntermediateString;

public class CheckRotation {
    public static boolean check(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcda";

        System.out.println("Check Roatation: "+check(s1, s2));
    }
}
