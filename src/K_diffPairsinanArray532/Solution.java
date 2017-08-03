package K_diffPairsinanArray532;

import java.util.Arrays;

/**
 * Created by Think on 8/3/17.
 */
public class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i-1])
                continue;
            for (int j = i+1; j < nums.length; j++) {
                if (k == nums[j]-nums[i]) {
                    count++;
                    break;
                }
                if (k < nums[j]-nums[i]) {
                    break;
                }
            }
        }
        return count;
    }
}
