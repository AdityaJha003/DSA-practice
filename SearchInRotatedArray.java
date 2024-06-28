// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4


public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (target == nums[mid]) {
                return mid;
            }

            // Left sorted portion
            if (nums[l] <= nums[mid]) {
                if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            // Right sorted portion
            else {
                if (target < nums[mid] || target > nums[r]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        SearchInRotatedArray s = new SearchInRotatedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(s.search(nums, target));
    }
}
