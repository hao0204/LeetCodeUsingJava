package BinaryTreeLevelOrderTraversal;

/**
 * Created by Think on 11/16/16.
 */
public class Test {
    public static void main (String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);
        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
        System.out.println(solution.levelOrder(root));
    }
}
