// https://leetcode.com/problems/longest-increasing-subsequence/
// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class longestIncSubsequence {
    public int lengthOfLIS(int[] nums) {
    List<Integer> tails = new ArrayList<>();

    for (final int num : nums)
      if (tails.isEmpty() || num > tails.get(tails.size() - 1))
        tails.add(num);
      else
        tails.set(firstGreaterEqual(tails, num), num);

    return tails.size();
  }

  private int firstGreaterEqual(List<Integer> A, int target) {
    final int i = Collections.binarySearch(A, target);
    return i < 0 ? -i - 1 : i;
  }
  public static void main(String[] args) {
    longestIncSubsequence obj = new longestIncSubsequence();
    int[] nums = {10,9,2,5,3,7,101,18};
    System.out.println(obj.lengthOfLIS(nums));
  }
}
