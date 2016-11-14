package LowestCommonAncestorofaBinarySearchTree;

import java.util.ArrayList;
import java.util.List;

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val)*(root.val - q.val) > 0){
            root = p.val < root.val ? root.left : root.right;
        }
        return root;
    }
}



