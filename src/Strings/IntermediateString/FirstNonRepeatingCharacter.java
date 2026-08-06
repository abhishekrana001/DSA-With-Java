package Strings.IntermediateString;

public class FirstNonRepeatingCharacter {
    public static Character nonRepeating(String str){
        int[] freq = new int[26];
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int index = ch - 'a';
            if(freq[index] == 1){
                return ch;
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        String str = "aabcddee";

        System.out.println("First Non Repeating Character: "+nonRepeating(str));
    }
}
