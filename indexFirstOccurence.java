// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

// Example 1:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

// Example 2:
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.


public class indexFirstOccurence {
    public int strStr(String haystack, String needle) {
        final int m = haystack.length();
        final int n = needle.length();
    
        for (int i = 0; i < m - n + 1; ++i)
          if (haystack.substring(i, i + n).equals(needle))
            return i;
    
        return -1;
      }
      public static void main(String[] args) {
        indexFirstOccurence i = new indexFirstOccurence();
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(i.strStr(haystack, needle));
      }
}
