// https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

// Given an array of N integers arr[] where each element represents the maximum length of the jump that can be made forward from that element. This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
// Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.

// Note: Return -1 if you can't reach the end of the array.

#include <iostream>
#include <vector>
#include <algorithm>

int jump(std::vector<int>& nums) {
    int jump = 0;
    int pos = 0;
    int des = 0;

    for (int i = 0; i < nums.size() - 1; i++) {
        des = std::max(des, nums[i] + i);

        if (pos == i) {
            pos = des;
            jump++;
        }
    }
    return jump;
}

int main() {
    std::vector<int> nums = {2, 3, 1, 1, 4};
    int result = jump(nums);
    std::cout << "Minimum jumps required: " << result << std::endl;
    return 0;
}

