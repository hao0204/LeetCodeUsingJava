package ArrayPartitionI561;

import java.util.Arrays;

/**
 * Created by Think on 5/31/17.
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i+=2) {
            res += Math.min(nums[i], nums[i+1]);
        }
        return res;
    }
}
