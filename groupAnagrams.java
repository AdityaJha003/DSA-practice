// https://leetcode.com/problems/group-anagrams/description/
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]


import java.util.*;
public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> keyToAnagrams = new HashMap<>();
    
        for (final String str : strs) {
          char[] chars = str.toCharArray();
          Arrays.sort(chars);
          String key = String.valueOf(chars);
          keyToAnagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
    
        return new ArrayList<>(keyToAnagrams.values());
      }
      public static void main(String[] args) {
        groupAnagrams ga = new groupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(ga.groupAnagrams(strs));
      }
}
