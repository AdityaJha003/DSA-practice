public class firstLastPosiArray {
    public int[] searchRange(int[] nums, int target) {
        final int l = firstGreaterEqual(nums, target);
        if (l == nums.length || nums[l] != target)
          return new int[] {-1, -1};
        final int r = firstGreaterEqual(nums, target + 1) - 1;
        return new int[] {l, r};
      }
    
      private int firstGreaterEqual(int[] A, int target) {
        int l = 0;
        int r = A.length;
        while (l < r) {
          final int m = (l + r) / 2;
          if (A[m] >= target)
            r = m;
          else
            l = m + 1;
        }
        return l;
      }
      public static void main(String[] args) {
        firstLastPosiArray obj = new firstLastPosiArray();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = obj.searchRange(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
      }
}
