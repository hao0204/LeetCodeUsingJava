package MinimumAbsoluteDifferenceinBST530;

/**
 * Created by Think on 4/7/17.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(2);
        a.right = b;
        b.left = c;
        System.out.println(solution.getMinimumDifference(a));
    }
}
