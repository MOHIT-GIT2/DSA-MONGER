package recursion.permutation;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:
Input: digits = "2"
Output: ["a","b","c"]
 */

import java.util.ArrayList;
import java.util.List;

public class letterCombinationOfPhone_17 {
    static void main() {
        String digits="23";
        List<String> list=letterCombinations(digits);
        System.out.println(list);
    }
    public static List<String> letterCombinations(String digits) {
        String[] strArr={"","","abc","def","ghi","jkl","mnop","qrs","tuv","wxyz"};
        return helper(0,"",digits,strArr,new ArrayList<String>());
    }

    private static List<String> helper(int currentIndex, String processed, String digits, String[] strArr, ArrayList<String> list) {
        if (processed.length()==digits.length()){
            list.add(processed);
            return list;
        }
        int value=digits.charAt(currentIndex)-'0';
        for (int i = 0; i < strArr[value].length(); i++) {
            char ch=strArr[value].charAt(i);
            helper(currentIndex+1,processed+ch,digits,strArr,list);
        }
        return list;
    }
}
