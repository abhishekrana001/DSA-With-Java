package Recursion.AdvanceRecursion;

public class CountTotalPermutations {
    public static int countPermutations(String str){
        if(str.length() == 0){
            return 1;
        }
        int count = 0;
        for(int i = 0; i < str.length(); i++){

            String remaining =  str.substring(0, i) + str.substring(i + 1);

            count = count + countPermutations(remaining);
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abc";

        System.out.println(countPermutations(str));
    }
}
