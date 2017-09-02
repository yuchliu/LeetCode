package DFS.PathSum;


class Solution {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null) return false;
        if (root.left == null && root.right == null) return root.val==sum;
        sum -= root.val;
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}

