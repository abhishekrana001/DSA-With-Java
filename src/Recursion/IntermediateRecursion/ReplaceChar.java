package Recursion.IntermediateRecursion;

public class ReplaceChar {
    public static String replace(String str, char oldChar, char newChar, int index){
        if(index == str.length()){
            return "";
        }
        if(str.charAt(index) == oldChar){
            return newChar + replace(str, oldChar, newChar, index+1);
        }
        return str.charAt(index) + replace(str, oldChar, newChar, index+1);
    }

    public static void main(String[] args) {
        String str = "banana";
        char oldChar = 'a';
        char newchar = 'x';
        System.out.println(replace(str, oldChar, newchar, 0));
    }
}
