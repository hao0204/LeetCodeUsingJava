package ShortestUnsortedContinuousSubarray581;


import java.util.Arrays;
import java.util.List;

/**
 * Created by Think on 6/1/17.
 */
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int begin = -1, end = -2, n = nums.length, min = nums[n-1], max = nums[0];
        for (int i = 1; i < n; ++i) {
            max = Math.max(max, nums[i]);
            if (nums[i] < max) {
                end = i;
            }
            min = Math.min(min, nums[n-1-i]);
            if (nums[n-1-i] > min) {
                begin = n-1-i;
            }
        }
        return end - begin + 1;
    }
}