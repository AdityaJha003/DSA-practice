// https://leetcode.com/problems/3sum/
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.

import java.util.*;

public class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3)
          return new ArrayList<>();
    
        List<List<Integer>> ans = new ArrayList<>();
    
        Arrays.sort(nums);
    
        for (int i = 0; i + 2 < nums.length; ++i) {
          if (i > 0 && nums[i] == nums[i - 1])
            continue;
          // Choose nums[i] as the first number in the triplet, then search the
          // remaining numbers in [i + 1, n - 1].
          int l = i + 1;
          int r = nums.length - 1;
          while (l < r) {
            final int sum = nums[i] + nums[l] + nums[r];
            if (sum == 0) {
              ans.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
              while (l < r && nums[l] == nums[l - 1])
                ++l;
              while (l < r && nums[r] == nums[r + 1])
                --r;
            } else if (sum < 0) {
              ++l;
            } else {
              --r;
            }
          }
        }
    
        return ans;
      }
      public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        ThreeSum s = new ThreeSum();
        List<List<Integer>> ans = s.threeSum(nums);
        for (List<Integer> l : ans) {
          System.out.println(l);
        }
      }
}