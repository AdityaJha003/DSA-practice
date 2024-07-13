public class symmetricTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return p == q;

        return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }

    public static void main(String[] args) {
        symmetricTree s = new symmetricTree();
        TreeNode root = s.new TreeNode(1);
        root.left = s.new TreeNode(2);
        root.right = s.new TreeNode(2);
        root.left.left = s.new TreeNode(3);
        root.left.right = s.new TreeNode(4);
        root.right.left = s.new TreeNode(4);
        root.right.right = s.new TreeNode(3);

        System.out.println(s.isSymmetric(root));
    }
}
