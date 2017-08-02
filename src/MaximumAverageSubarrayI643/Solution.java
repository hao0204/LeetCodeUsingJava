package MaximumAverageSubarrayI643;

/**
 * Created by Think on 8/2/17.
 */
public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = Integer.MIN_VALUE;
        for (int i = 0; i+k-1 < nums.length; ++i) {
            int temp = 0;
            for (int j = 0; j < k; j++) {
                temp += nums[i+j];
            }
            avg = Math.max(avg, temp*1.0/k);
        }
        return avg;
    }
}
