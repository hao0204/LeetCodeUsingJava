package MaximumSubarray53;

/**
 * Created by Think on 8/17/17.
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], temp = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            temp = Math.max(nums[i], nums[i] + temp);
            max = Math.max(max, temp);
        }
        return max;
    }
}
