package Strings.BasicProgram;

public class ToggleCase {
    public static String toLowerCase(String str) {
        StringBuilder ans =  new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z') {
                ans.append((char) (c - 32));
            }else if(c >= 'A' && c <= 'Z') {
                ans.append((char) (c + 32));
            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String  str = "abHiShEk";
        System.out.println("Original String: " + str);
        System.out.println("Toggle Case: " + toLowerCase(str));
    }
}
