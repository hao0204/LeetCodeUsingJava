package sumofLeftLeaves;

/**
 * Created by Think on 10/24/16.
 */
public class Test {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode a0 = new TreeNode(0);

        TreeNode a1 = new TreeNode(2);
        TreeNode a2 = new TreeNode(4);

        TreeNode a3 = new TreeNode(1);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(-1);

        TreeNode a6 = new TreeNode(5);
        TreeNode a7 = new TreeNode(1);
        TreeNode a8 = new TreeNode(6);
        TreeNode a9 = new TreeNode(8);

        a0.left = a1;
        a0.right = a2;

        a1.left = a3;
        a2.left = a4;
        a2.right = a5;

        a3.left = a6;
        a3.right = a7;
        a4.right = a8;
        a5.right = a9;

        System.out.println(solution.sumOfLeftLeaves(a0));
    }
}
