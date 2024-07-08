// https://leetcode.com/problems/search-insert-position/description/
// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4


public class searchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
    
        while (l < r) {
          final int m = (l + r) / 2;
          if (nums[m] == target)
            return m;
          if (nums[m] < target)
            l = m + 1;
          else
            r = m;
        }
    
        return l;
      }
      public static void main(String[] args) {
        searchInsertPosition s = new searchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(s.searchInsert(nums, target));
      }
}
