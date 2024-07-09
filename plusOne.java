// https://leetcode.com/problems/plus-one/description/
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].


public class plusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
          if (digits[i] < 9) {
            ++digits[i];
            return digits;
          }
          digits[i] = 0;
        }
    
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
      }
      public static void main(String[] args) {
        plusOne p = new plusOne();
        int[] digits = {1,2,3};
        int[] result = p.plusOne(digits);
        for (int i = 0; i < result.length; i++) {
          System.out.print(result[i] + " ");
        }
      }
}
