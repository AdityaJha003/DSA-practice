// https://leetcode.com/problems/maximum-product-subarray/description/
// Given an integer array nums, find a subarray that has the largest product, and return the product.
// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.

public class maximumProductSubarray {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int currentMin = 1, currentMax = 1;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            if (n == 0) {
                currentMin = 1;
                currentMax = 1;
                result = Math.max(result, 0);
                continue;
            }

            int tempMax = currentMax * n;
            currentMax = Math.max(Math.max(tempMax, currentMin * n), n);
            currentMin = Math.min(Math.min(tempMax, currentMin * n), n);

            result = Math.max(result, currentMax);
        }

        return result;
    }
    public static void main(String[] args) {
        maximumProductSubarray test = new maximumProductSubarray();
        int[] nums = {2,3,-2,4};
        System.out.println(test.maxProduct(nums));
    }
}
