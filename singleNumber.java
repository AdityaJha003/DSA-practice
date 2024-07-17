// https://leetcode.com/problems/single-number/description/
// Input: nums = [2,2,1]
// Output: 1

public class singleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
    
        for (final int num : nums)
          ans ^= num;
    
        return ans;
      }
      public static void main(String[] args) {
        
      }
}
