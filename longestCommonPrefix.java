// https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/description/?envType=daily-question&envId=2024-07-05

// Input: strs = ["flower","flow","flight"]
// Output: "fl"

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
          return "";
    
        for (int i = 0; i < strs[0].length(); ++i)
          for (int j = 1; j < strs.length; ++j)
            if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i))
              return strs[0].substring(0, i);
    
        return strs[0];
      }
      public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        longestCommonPrefix l = new longestCommonPrefix();
        System.out.println(l.longestCommonPrefix(strs));
      }
}
