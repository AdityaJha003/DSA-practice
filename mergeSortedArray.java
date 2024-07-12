// https://leetcode.com/problems/merge-sorted-array/description/
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // nums1's index (the actual nums)
        int j = n - 1;     // nums2's index
        int k = m + n - 1; // nums1's index (the next filled position)
    
        while (j >= 0)
          if (i >= 0 && nums1[i] > nums2[j])
            nums1[k--] = nums1[i--];
          else
            nums1[k--] = nums2[j--];
      }
      public static void main(String[] args) {
        mergeSortedArray s = new mergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
    
        s.merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
          System.out.println(nums1[i]);
        }
      }
}
