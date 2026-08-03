package Strings.BasicProgram;

public class CountVowels {
    public static int count(String s){
        int count = 0;
        s = s.toLowerCase();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Abhishek";

        System.out.println("Count of Vowels is: " + count(s));
    }
}
