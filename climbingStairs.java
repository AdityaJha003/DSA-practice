// https://leetcode.com/problems/climbing-stairs/description/
// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps

public class climbingStairs {
    public int climbStairs(int n) {
        int prev1 = 1; // dp[i - 1]
        int prev2 = 1; // dp[i - 2]
    
        for (int i = 2; i <= n; ++i) {
          final int dp = prev1 + prev2;
          prev2 = prev1;
          prev1 = dp;
        }
    
        return prev1;
      }
      public static void main(String[] args) {
        climbingStairs s = new climbingStairs();
        int n = 2;
        int result = s.climbStairs(n);
        System.out.println(result);
      }
}
