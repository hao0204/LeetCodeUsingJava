package ValidTriangleNumber611;

import java.util.Arrays;

/**
 * Created by Think on 8/31/17.
 */
public class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length-2; ++i) {
            for (int j = i + 1, k = j + 1; j < nums.length-1;) {
                if (nums[i] + nums[j] > nums[k]) {
                    ++count;
                    ++k;
                }
                if (k == nums.length || nums[i] + nums[j] <= nums[k]) {
                    ++j;
                    k = j+1;
                }
            }
        }
        return count;
    }
}
