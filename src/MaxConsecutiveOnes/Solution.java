package MaxConsecutiveOnes;

/**
 * Created by Think on 2/2/17.
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int num = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                ++num;
            } else {
                if (max < num)
                    max = num;
                num = 0;
            }
        }
        if (max < num)
            max = num;
        return max;
    }
}
