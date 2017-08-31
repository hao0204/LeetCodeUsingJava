package ArrayNesting565;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Think on 8/31/17.
 */
public class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; ++i) {
            int j = i;
            int size = 0;
            while(nums[j] >= 0) {
                int temp = nums[j];
                nums[j] = -1;
                j = temp;
                ++size;
            }
            max = Math.max(max, size);
        }
        return max;
    }
}
