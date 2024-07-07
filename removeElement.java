// https://leetcode.com/problems/remove-element/
// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 2.
// It does not matter what you leave beyond the returned k (hence they are underscores).

public class removeElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
    
        for (final int num : nums)
          if (num != val)
            nums[i++] = num;
    
        return i;
      }
      public static void main(String[] args) {
        removeElement r = new removeElement();
        int[] nums = {3, 2, 2, 3};
        System.out.println(r.removeElement(nums, 3));
      }
}
