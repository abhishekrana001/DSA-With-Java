package Recursion.IntermediateRecursion;

import java.util.Scanner;

public class ReverseString {
    public static String stringReverse(String str, int index){
        if(index == str.length()){
            return "";
        }
        String result = stringReverse(str, index+1);
        return result + str.charAt(index);
    }
    public static void  main(String args[]){
        String str = "Abhishek";

        System.out.println("Reverse String : " + stringReverse(str,0));
    }
}
