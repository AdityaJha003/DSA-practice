// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

// Problem: Find Minimum in Rotated Sorted Array
// public Input: nums = [3,4,5,1,2]
// Output: 1
// Explanation: The original array was [1,2,3,4,5] rotated 3 times.

public class MinInRotatedArray{
    public int findMin(int[] nums) {
        int res = nums[0];
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            int m = (l + r) / 2;
            res = Math.min(res, nums[m]);

            if (nums[m] >= nums[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        MinInRotatedArray obj = new MinInRotatedArray();
        int[] nums = {3,4,5,1,2};
        System.out.println(obj.findMin(nums));
    }
}