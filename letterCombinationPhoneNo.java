// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]


import java.util.ArrayList;
import java.util.List;

public class letterCombinationPhoneNo {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
          return new ArrayList<>();
    
        List<String> ans = new ArrayList<>();
    
        dfs(digits, 0, new StringBuilder(), ans);
        return ans;
      }
    
      private static final String[] digitToLetters = {"",    "",    "abc",  "def", "ghi",
                                                      "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
      private void dfs(String digits, int i, StringBuilder sb, List<String> ans) {
        if (i == digits.length()) {
          ans.add(sb.toString());
          return;
        }
    
        for (final char c : digitToLetters[digits.charAt(i) - '0'].toCharArray()) {
          sb.append(c);
          dfs(digits, i + 1, sb, ans);
          sb.deleteCharAt(sb.length() - 1);
        }
      }
      public static void main(String[] args) {
        letterCombinationPhoneNo lcp = new letterCombinationPhoneNo();
        System.out.println(lcp.letterCombinations("23"));
      }
}
