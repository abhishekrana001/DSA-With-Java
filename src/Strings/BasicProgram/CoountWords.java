package Strings.BasicProgram;

public class CoountWords {
    public static int count(String str) {
        if(str == null || str.trim().isEmpty()){
            return 0;
        }
        int count = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1) == ' ' && str.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "My Name is Abhishek";

        System.out.println("Count of Words: " + count(str));
    }
}
