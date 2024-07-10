// https://leetcode.com/problems/sqrtx/description/
// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.


public class sqrtOfX {
    public int mySqrt(long x) {
        long l = 1;
        long r = x + 1;
    
        while (l < r) {
          final long m = (l + r) / 2;
          if (m > x / m)
            r = m;
          else
            l = m + 1;
        }
    
        // l := the minimum number s.t. l * l > x
        return (int) l - 1;
      }
      public static void main(String[] args) {
        sqrtOfX s = new sqrtOfX();
        int x = 4;
        int result = s.mySqrt(x);
        System.out.println(result);
      }
}
