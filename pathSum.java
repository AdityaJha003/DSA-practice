// https://leetcode.com/problems/path-sum/
// Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
// Output: true
// Explanation: The root-to-leaf path with the target sum is shown.

import java.util.*;

public class pathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.left == null && root.right == null){
            return root.val == sum;
        }
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);

    }
    public static void main(String[] args) {
        System.out.println("Path Sum");
    }
}
