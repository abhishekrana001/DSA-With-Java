package Recursion.AdvanceRecursion;

public class printallSubsequences {
    public static void subSequences(String str, int index, String current){
        if(index == str.length()){
            System.out.println(current);
            return;
        }
        subSequences(str, index + 1, current + str.charAt(index));
        subSequences(str, index + 1, current);
    }

    public static void main(String[] args) {
        String str = "abc";
        int index = 0;
        subSequences(str, index, "");
    }
}
