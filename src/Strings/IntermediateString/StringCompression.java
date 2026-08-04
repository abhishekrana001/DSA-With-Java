package Strings.IntermediateString;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabcccccddaaa";
//        if(s == null || s.length() == 0) return;
        int count = 1;

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                sb.append(s.charAt(i - 1));
                if(count > 1){
                    sb.append(count);
                }
                count = 1;
            }
        }
//  Handle last group
        sb.append(s.charAt(s.length()-1));
        if(count > 1){
            sb.append(count);
        }
        System.out.println(sb.toString());
    }
}
