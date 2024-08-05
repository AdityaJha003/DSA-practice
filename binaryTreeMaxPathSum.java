// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Input: root = [1,2,3]
// Output: 6
// Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.


import javax.swing.tree.TreeNode;

public class binaryTreeMaxPathSum {
    public int maxPathSum(TreeNode root) {
        maxPathSumDownFrom(root);
        return ans;
      }
    
      private int ans = Integer.MIN_VALUE;
    
      // Returns the maximum path sum starting from the current root, where
      // root.val is always included.
      private int maxPathSumDownFrom(TreeNode root) {
        if (root == null)
          return 0;
    
        final int l = Math.max(maxPathSumDownFrom(root.left), 0);
        final int r = Math.max(maxPathSumDownFrom(root.right), 0);
        ans = Math.max(ans, root.val + l + r);
        return root.val + Math.max(l, r);
      }
      public static void main(String[] args) {
        binaryTreeMaxPathSum obj = new binaryTreeMaxPathSum();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        System.out.println(obj.maxPathSum(root));
      }
}
