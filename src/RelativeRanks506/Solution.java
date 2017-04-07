package RelativeRanks506;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Think on 4/7/17.
 */
public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] ranks = nums.clone();
        Arrays.sort(ranks);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ranks.length; ++i) {
            map.put(ranks[i], ranks.length - 1 - i);
        }
        String[] res = new String[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            int temp = map.get(nums[i]);
            if (temp == 0)
                res[i] = "Gold Medal";
            else if (temp == 1)
                res[i] = "Silver Medal";
            else if (temp == 2)
                res[i] = "Bronze Medal";
            else
                res[i] = String.valueOf(temp + 1);
        }
        return res;
    }
}
