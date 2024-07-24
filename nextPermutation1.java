// https://leetcode.com/problems/next-permutation/description/

// Example 1:
// Input: nums = [1,2,3]
// Output: [1,3,2]

// Example 2:
// Input: nums = [3,2,1]
// Output: [1,2,3]

// Example 3:
// Input: nums = [1,1,5]
// Output: [1,5,1]

public class nextPermutation1 {
    public void nextPermutation(int[] nums) {
        final int n = nums.length;
    
        // From back to front, find the first number < nums[i + 1].
        int i;
        for (i = n - 2; i >= 0; --i)
          if (nums[i] < nums[i + 1])
            break;
    
        // From back to front, find the first number > nums[i], swap it with
        // nums[i].
        if (i >= 0)
          for (int j = n - 1; j > i; --j)
            if (nums[j] > nums[i]) {
              swap(nums, i, j);
              break;
            }
    
        // Reverse nums[i + 1..n - 1].
        reverse(nums, i + 1, n - 1);
      }
    
      private void reverse(int[] nums, int l, int r) {
        while (l < r)
          swap(nums, l++, r--);
      }
    
      private void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
      public static void main(String[] args) {
        nextPermutation1 obj = new nextPermutation1();
        int[] nums = {1,2,3};
        obj.nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
      }
}
