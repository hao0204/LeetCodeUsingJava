package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 11/27/16.
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) return res;
        generating(res, 1, numRows);
        return res;
    }
    public void generating(List<List<Integer>> res, int index, int numRows) {
        if (index > numRows) return;
        if (index == 1) {
            List<Integer> r = new ArrayList<>();
            r.add(1);
            res.add(r);
        } else if (index == 2) {
            List<Integer> r = new ArrayList<>();
            r.add(1);
            r.add(1);
            res.add(r);
        } else {
            List<Integer> pre = res.get(res.size()-1);
            List<Integer> r = new ArrayList<>();
            r.add(1);
            for (int i = 0; i < pre.size()-1; ++i){
                r.add(pre.get(i) + pre.get(i+1));
            }
            r.add(1);
            res.add(r);
        }
        generating(res, index+1, numRows);
    }
}
