// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

public class longestSubstringNoRepeat {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] count = new int[128];
    
        for (int l = 0, r = 0; r < s.length(); ++r) {
          ++count[s.charAt(r)];
          while (count[s.charAt(r)] > 1)
            --count[s.charAt(l++)];
          ans = Math.max(ans, r - l + 1);
        }
    
        return ans;
      }
      public static void main(String[] args) {
        longestSubstringNoRepeat obj = new longestSubstringNoRepeat();
        String s = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s));
      }
}
