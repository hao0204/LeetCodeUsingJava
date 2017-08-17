package RemoveDuplicatesfromSortedArray26;

/**
 * Created by Think on 8/17/17.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num: nums) {
            if (i == 0 || num > nums[i-1]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}
