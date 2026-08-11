package Recursion.IntermediateRecursion;

public class RemoveCharatcerString {
    public static String remove(String str, char target, int index){
        if(index == str.length()){
            return "";
        }
        char ch = str.charAt(index);

        if(str.charAt(index) == target){
            return remove(str,target,index+1);
        }
        return ch +  remove(str,target,index+1);
    }

    public static void main(String[] args) {
        String str = "banana";
        char target = 'a';
        System.out.println(remove(str,target,0));
    }
}
