package Strings.IntermediateString;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "I Love Java";

        String[] words = s.split(" ");
        for(int i= words.length - 1; i >= 0 ; i--)
            System.out.print(words[i]+" ");
    }
}
