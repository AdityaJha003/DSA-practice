// https://leetcode.com/problems/3sum-closest/
// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

public class 3sumCloset {
    public int threeSumClosest(int[] nums, int target) {
        int ans = nums[0] + nums[1] + nums[2];
    
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
            if (sum == target)
              return sum;
            if (Math.abs(sum - target) < Math.abs(ans - target))
              ans = sum;
            if (sum < target)
              ++l;
            else
              --r;
          }
        }
    
        return ans;
      }
}
