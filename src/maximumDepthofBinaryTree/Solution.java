package maximumDepthofBinaryTree;
/**
 * Definition for a binary tree node.
 * 
 */
public class Solution {
    public int maxDepth(TreeNode root) {
    	if (root == null) return 0;
        if (root.left == null && root.right == null)
    		return 1;
        if (root.left == null)
        	return 1+maxDepth(root.right);
        if (root.right == null)
        	return 1+maxDepth(root.left);
        int left = 1+maxDepth(root.left);
        int right = 1+maxDepth(root.right);
        return left > right ? left : right;
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}