// https://leetcode.com/problems/same-tree/description/
// Input: p = [1,2,3], q = [1,2,3]
// Output: true
// Input: p = [1,2], q = [1,null,2]
// Output: false

import java.util.*;

public class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null || q == null)
      return p == q;
    return p.val == q.val &&          //
        isSameTree(p.left, q.left) && //
        isSameTree(p.right, q.right);
  }
  public static void main(String[] args) {
    sameTree s = new sameTree();
    TreeNode p = s.new TreeNode(1);
    p.left = s.new TreeNode(2);
    p.right = s.new TreeNode(3);
    TreeNode q = s.new TreeNode(1);
    q.left = s.new TreeNode(2);
    q.right = s.new TreeNode(3);

    System.out.println(s.isSameTree(p, q));
  }

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
}
