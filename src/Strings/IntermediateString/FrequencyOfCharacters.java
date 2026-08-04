package Strings.IntermediateString;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String s = "Programming";
        s = s.toLowerCase();
        int[] freq = new int[26];

        for(int j = 0; j < s.length(); j++){
            freq[s.charAt(j) - 'a']++;
        }

        for(int i=0; i < 26; i++){
            if(freq[i] > 0){
                System.out.println((char)(i+'a') + " = " + freq[i]);
            }
        }
    }
}
