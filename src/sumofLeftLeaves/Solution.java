package sumofLeftLeaves;

/**
 * Created by Think on 10/24/16.
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int val = 0;
        if (root == null)
            return 0;
        if (root.left == null)
            return sumOfLeftLeaves(root.right);
        if (root.left.left == null && root.left.right == null)
            return root.left.val + sumOfLeftLeaves(root.right);
        else
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
//        return val + sumOfLeftLeaves(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}