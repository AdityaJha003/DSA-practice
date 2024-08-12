// https://leetcode.com/problems/palindromic-substrings/
// Input: s = "aaa"
// Output: 6
// Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

public class palindromicSubstrings {
    public int countSubstrings(String s) {
        int ans = 0;
    
        for (int i = 0; i < s.length(); ++i) {
          ans += extendPalindromes(s, i, i);
          ans += extendPalindromes(s, i, i + 1);
        }
    
        return ans;
      }
    
      private int extendPalindromes(final String s, int l, int r) {
        int count = 0;
    
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
          ++count;
          --l;
          ++r;
        }
    
        return count;
      }
      public static void main(String[] args) {
        palindromicSubstrings obj = new palindromicSubstrings();
        String s = "abc";
        System.out.println(obj.countSubstrings(s));
      }
}
