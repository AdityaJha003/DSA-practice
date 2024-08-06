// https://leetcode.com/problems/coin-change/
// Input: coins = [1,2,5], amount = 11
// Output: 3
// Explanation: 11 = 5 + 5 + 1


import java.util.Arrays;

public class coinChange {
    public int coinChange(int[] coins, int amount) {
    // dp[i] := the minimum number of coins to make up i
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, 1, dp.length, amount + 1);

    for (final int coin : coins)
      for (int i = coin; i <= amount; ++i)
        dp[i] = Math.min(dp[i], dp[i - coin] + 1);

    return dp[amount] == amount + 1 ? -1 : dp[amount];
  }
  public static void main(String[] args) {
    coinChange cc = new coinChange();
    int[] coins = {1, 2, 5};
    int amount = 11;
    System.out.println(cc.coinChange(coins, amount));
  }
}