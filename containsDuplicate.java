// https://leetcode.com/problems/contains-duplicate/
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.HashSet;

public class containsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashset.contains(nums[i])) {
                return true;
            }
            hashset.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        containsDuplicate test = new containsDuplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println(test.containsDuplicate(nums)); 
    }
    
}
