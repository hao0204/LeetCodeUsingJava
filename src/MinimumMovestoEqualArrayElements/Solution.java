package MinimumMovestoEqualArrayElements;

/**
 * Created by Think on 11/12/16.
 */
public class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = nums[0];
        for (int i: nums) min = Math.min(min, i);
        for (int i: nums) sum += i - min;
        return sum;
    }
}
