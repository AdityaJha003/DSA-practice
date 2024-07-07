// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

public class removeDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
    
        for (final int num : nums)
          if (i < 1 || num > nums[i - 1])
            nums[i++] = num;
    
        return i;
      }
      public static void main(String[] args) {
        removeDuplicatesSortedArray r = new removeDuplicatesSortedArray();
        int[] nums = {1, 1, 2};
        System.out.println(r.removeDuplicates(nums));
      }
}
