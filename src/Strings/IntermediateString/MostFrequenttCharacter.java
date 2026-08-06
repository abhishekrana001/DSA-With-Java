package Strings.IntermediateString;

public class MostFrequenttCharacter {
    public static Character mostFrequentCharacter(String str) {
        str = str.toLowerCase();
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            freq[index]++;
        }
        int max = 0;
        char ans = '#';
        for(int j=0; j<str.length(); j++) {
            char ch = str.charAt(j);
            int index = ch - 'a';
            if(freq[index] > max){
                max = freq[index];
                ans = ch;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "aabcddddee";

        System.out.println("Most Frequent Character: "+mostFrequentCharacter(str));
    }
}
