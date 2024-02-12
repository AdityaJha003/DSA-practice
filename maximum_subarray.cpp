// https://leetcode.com/problems/maximum-subarray/

// Given an integer array nums, find the subarray with the largest sum, and return its sum.

#include <vector>
#include <algorithm>

class Solution {
public:
    int maxSubArray(std::vector<int>& nums) {
        int currentMax = nums[0];
        int max = nums[0];
        
        for (int i = 1; i < nums.size(); ++i) {
            currentMax = std::max(nums[i], currentMax + nums[i]);
            if (currentMax > max) {
                max = currentMax;
            }
        }
        
        return max;
    }
};
