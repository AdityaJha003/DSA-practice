// https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Input: root = [2,null,3,null,4,null,5,null,6]
// Output: 5

import javax.swing.tree.TreeNode;

public class minDepthBinaryTree {
    public int minDepth(TreeNode root) {
    if (root == null)
      return 0;
    if (root.left == null)
      return minDepth(root.right) + 1;
    if (root.right == null)
      return minDepth(root.left) + 1;
    return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
  }
}
