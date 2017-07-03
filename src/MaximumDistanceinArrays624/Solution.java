package MaximumDistanceinArrays624;

import java.util.List;

/**
 * Created by Think on 6/29/17.
 */
public class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int res = 0, max = arrays.get(0).get(arrays.get(0).size()-1), min = arrays.get(0).get(0);
        for (int i = 1; i < arrays.size(); ++i) {
            List<Integer> array = arrays.get(i);
            res = Math.max(res, Math.max(array.get(array.size()-1) - min, max - array.get(0)));
            min = Math.min(min, array.get(0));
            max = Math.max(max, array.get(array.size()-1));
        }
        return res;
    }
}
