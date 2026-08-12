package Recursion.AdvanceRecursion;

public class CountTotalSubsequences {
    public static int count(String str, int index){
        if(index == str.length()){
            return 1;
        }
        int take = count(str, index + 1);
        int notTake = count(str, index + 1);
        return take + notTake;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(count(str, 0));
    }
}
