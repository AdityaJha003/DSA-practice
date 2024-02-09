// https://leetcode.com/problems/contains-duplicate/submissions/1170714423/

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

#include<bits/stdc++.h>
using namespace std;
    
bool containsDuplicate(vector<int> nums) {
 
    sort(nums.begin(),nums.end());
    
    for(int index = 1; index < nums.size(); index++) {
        if(nums[index ] == nums[index - 1]) {
            return true;
        }
    }

    return false;
}
    
int main () {
	    
    vector<int> nums {1, 2, 3, 1};
    
    bool res = containsDuplicate(nums);
    
    // printing the result
    if(res== 1)
        cout<<"true"<<endl;
    else
        cout<<"false"<<endl;
}