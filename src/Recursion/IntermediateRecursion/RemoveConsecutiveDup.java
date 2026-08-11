package Recursion.IntermediateRecursion;

public class RemoveConsecutiveDup {
    public static String removeDup(String str,int index){
        if(index == str.length()){
            return "";
        }
        if(index == str.length()-1){
            return String.valueOf(str.charAt(index));
        }
        if(str.charAt(index - 1) == str.charAt(index)){
            return removeDup(str,index + 1);
        }

        return str.charAt(index - 1) + removeDup(str, index + 1);
    }

    public static void main(String[] args) {
        String str = "aabbccc";
        System.out.println(removeDup(str,1));
    }
}
