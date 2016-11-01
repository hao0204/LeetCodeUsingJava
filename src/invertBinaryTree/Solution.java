package invertBinaryTree;

/**
 * Created by Think on 11/1/16.
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        if (root == null) return root;
        temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
