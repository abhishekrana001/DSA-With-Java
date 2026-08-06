package Strings.IntermediateString;

public class LongestCommonPrefix {
    public static String prefix(String[] str){
        if(str.length == 0 || str == null){
            return "";
        }

        String first = str[0];
        for(int i=0; i<first.length(); i++){
            char ch = first.charAt(i);
            for(int j=0; j<str.length; j++){
                if(i >= str[j].length() || str[j].charAt(i) != ch){
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
    public static void main(String[] args) {

        String[] str = {"flower","flow","flight"};

        System.out.println("Longest Common Prefix: "+prefix(str));
    }
}
