package Recursion.AdvanceRecursion;

public class PrintallPermutations {
    public static void permutations(String str, String current){
        if(str.length() == 0){
            System.out.println(current);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            String remaining = str.substring(0,i) + str.substring(i+1);
            permutations(remaining,current + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "");
    }
}
