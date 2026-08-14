package Recursion.AdvanceRecursion;

import java.util.ArrayList;

public class LetterCombinations {
    static String[] keypad = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    public static void combinations(
            String digits,
            int index,
            String current,
            ArrayList<String> result) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';

        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);

            combinations(
                    digits,
                    index + 1,
                    current + ch,
                    result
            );
        }
    }

    public static void main(String[] args) {

        String digits = "23";

        ArrayList<String> result = new ArrayList<>();

        combinations(digits, 0, "", result);

        System.out.println(result);
    }
}
