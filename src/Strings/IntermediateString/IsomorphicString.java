package Strings.IntermediateString;

public class IsomorphicString {
    public static boolean isIsomorphic(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i=0; i<s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(map1[ch1] == 0 && map2[ch2] == 0){
                map1[ch1] = ch2;
                map2[ch2] = ch1;
            }else{
                if(map1[ch1] != ch2 || map2[ch2] != ch1){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";

        System.out.println(isIsomorphic(s1,s2));
    }
}
