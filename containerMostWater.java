// https://leetcode.com/problems/container-with-most-water/description/
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.


public class containerMostWater {
    public int maxArea(int[] height) {
        int ans = 0;
        int l = 0;
        int r = height.length - 1;
    
        while (l < r) {
          final int minHeight = Math.min(height[l], height[r]);
          ans = Math.max(ans, minHeight * (r - l));
          if (height[l] < height[r])
            ++l;
          else
            --r;
        }
    
        return ans;
      }
      public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        containerMostWater s = new containerMostWater();
        System.out.println(s.maxArea(height));
      }
}
