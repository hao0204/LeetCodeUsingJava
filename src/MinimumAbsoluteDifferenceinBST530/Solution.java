package MinimumAbsoluteDifferenceinBST530;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Think on 4/7/17.
 */
public class Solution {

    /* one solution. so bad!
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> allVals = new ArrayList<>();
        getVal(root, allVals);
        Collections.sort(allVals);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < allVals.size()-1; ++i) {
            int temp = allVals.get(i+1) - allVals.get(i);
            if (temp < min)
                min = temp;
        }
        return min;
    }
    */

    int min = Integer.MAX_VALUE;
    Integer pre = null;
    public int getMinimumDifference(TreeNode root) {
        if (root == null)
            return min;
        getMinimumDifference(root.left);
        if (pre != null)
            min = Math.min(min, root.val - pre);
        pre = root.val;
        getMinimumDifference(root.right);
        return min;
    }

    public void getVal(TreeNode root, ArrayList<Integer> allVals) {
        allVals.add(root.val);
        if (root.left != null)
            getVal(root.left, allVals);
        if (root.right != null)
            getVal(root.right, allVals);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
