package MissingNumber;

/**
 * Created by Think on 2/2/17.
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }
}
