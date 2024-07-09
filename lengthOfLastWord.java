// https://leetcode.com/problems/length-of-last-word/description/
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
    
        while (i >= 0 && s.charAt(i) == ' ')
          --i;
        final int lastIndex = i;
        while (i >= 0 && s.charAt(i) != ' ')
          --i;
    
        return lastIndex - i;
      }
      public static void main(String[] args) {
        lengthOfLastWord l = new lengthOfLastWord();
        String s = "Hello World";
        System.out.println(l.lengthOfLastWord(s));
      }
}
