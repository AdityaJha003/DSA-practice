// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.


import java.util.*;

public class intersectionTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
          return intersect(nums2, nums1);
    
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
    
        for (final int num : nums1)
          count.put(num, count.getOrDefault(num, 0) + 1);
    
        for (final int num : nums2)
          if (count.containsKey(num) && count.get(num) > 0) {
            ans.add(num);
            count.put(num, count.get(num) - 1);
          }
    
        return ans.stream().mapToInt(Integer::intValue).toArray();
      }

      public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        intersectionTwoArrays s = new intersectionTwoArrays();
        System.out.println(s.intersect(nums1, nums2));
      }
}
