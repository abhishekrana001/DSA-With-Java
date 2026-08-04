package Strings.IntermediateString;

public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String str) {
        boolean[] visited = new boolean[26];

        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int index = ch - 'a';
            visited[index] = false;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int index = ch - 'a';
            if(!visited[index]){
                sb.append(ch);
                visited[index] = true;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Programming";
        System.out.println(removeDuplicates(str));
    }
}
