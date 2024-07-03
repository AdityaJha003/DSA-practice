// https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/description/
// Input: nums = [5,3,2,4]
// Output: 0
// Explanation: We can make at most 3 moves.
// In the first move, change 2 to 3. nums becomes [5,3,3,4].
// In the second move, change 4 to 3. nums becomes [5,3,3,3].
// In the third move, change 5 to 3. nums becomes [3,3,3,3].
// After performing 3 moves, the difference between the minimum and maximum is 3 - 3 = 0.

import java.util.*;
public class minDiff3moves {
    public int minDifference(int[] nums) {
        final int n = nums.length;
        if (n < 5)
          return 0;
    
        int ans = Integer.MAX_VALUE;
    
        Arrays.sort(nums);
    
        // 1. Change nums[0..i) to nums[i].
        // 2. Change nums[n - 3 + i..n) to nums[n - 4 + i].
        for (int i = 0; i <= 3; ++i)
          ans = Math.min(ans, nums[n - 4 + i] - nums[i]);
    
        return ans;
      }
      public static void main(String[] args) {
        int[] nums = {5,3,2,4};
        minDiff3moves s = new minDiff3moves();
        System.out.println(s.minDifference(nums));
      }
}
