public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
          return false;
    
        int[] count = new int[26];
    
        for (final char c : s.toCharArray())
          ++count[c - 'a'];
    
        for (final char c : t.toCharArray()) {
          if (count[c - 'a'] == 0)
            return false;
          --count[c - 'a'];
        }
    
        return true;
      }
      public static void main(String[] args) {
        validAnagram obj = new validAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(obj.isAnagram(s, t));
      }
}
