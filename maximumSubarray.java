// https://leetcode.com/problems/maximum-subarray/description/

// Given an integer array nums, find the subarray with the largest sum, and return its sum.
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

import java.util.Arrays;

public class maximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += nums[i];
            maxSub = Math.max(maxSub, currentSum);
        }

        return maxSub;
    }
    public static void main(String[] args) {
        maximumSubarray test = new maximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(test.maxSubArray(nums));
    }
}
