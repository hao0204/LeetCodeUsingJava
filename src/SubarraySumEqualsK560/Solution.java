package SubarraySumEqualsK560;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Think on 8/31/17.
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> preMap = new HashMap<>();
        int sum = 0;
        preMap.put(0, 1);
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            if (preMap.containsKey(sum-k)) {
                count += preMap.get(sum-k);
            }
            preMap.put(sum, preMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
