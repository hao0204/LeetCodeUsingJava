package BinaryTreeLevelOrderTraversalII;

import java.util.*;

/**
 * Created by Think on 11/14/16.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<HashMap<TreeNode, Integer>> queue = new LinkedList<>();
        HashMap<TreeNode, Integer> a = new HashMap<>();
        a.put(root, 1);
        queue.offer(a);
        while (queue.size() != 0){
            HashMap<TreeNode, Integer> h = queue.remove();
            TreeNode treeNode = h.entrySet().iterator().next().getKey();
            int level = h.entrySet().iterator().next().getValue();
            if (treeNode.left != null) {
                HashMap<TreeNode, Integer> b = new HashMap<>();
                b.put(treeNode.left, level+1);
                queue.offer(b);
            }
            if (treeNode.right != null) {
                HashMap<TreeNode, Integer> c = new HashMap<>();
                c.put(treeNode.right, level+1);
                queue.offer(c);
            }
            if (res.size() < level) {
                List<Integer> c = new ArrayList<>();
                c.add(treeNode.val);
                res.add(0, c);
            }
            else if (res.size() >= level) {
                res.get(0).add(treeNode.val);
            }
        }
        return res;
    }

}
