package Recursion.IntermediateRecursion;

public class CountOcc {
    public static int count(String str, char target, int index){
        str = str.toLowerCase();
        if(index == str.length()){
            return 0;
        }
        int count = 0;
        if(str.charAt(index) == target){
            count = 1;
        }
        return count +  count(str,target,index+1);
    }

    public static void main(String[] args) {
        String str = "Programming";
        char target = 'g';

        System.out.println(count(str,target ,0));
    }
}
