// https://leetcode.com/problems/three-consecutive-odds/description/
// Input: arr = [2,6,4,1]
// Output: false
// Explanation: There are no three consecutive odds.


public class ThreeConsecutiveNo {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int v : arr) {
            if (v % 2 == 1) {
                ++count;
            } else {
                count = 0;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,4,1};
        ThreeConsecutiveNo s = new ThreeConsecutiveNo();
        System.out.println(s.threeConsecutiveOdds(arr));
    }
}
