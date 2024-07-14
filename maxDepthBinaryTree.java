// https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Input: root = [3,9,20,null,null,15,7]
// Output: 3

import java.util.*;
import java.util.LinkedList;

public class maxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
          return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
      }
      public static void main(String[] args) {
        maxDepthBinaryTree m = new maxDepthBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(m.maxDepth(root));
      }
}
