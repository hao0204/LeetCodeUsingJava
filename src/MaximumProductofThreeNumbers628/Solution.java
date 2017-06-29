package MaximumProductofThreeNumbers628;

/**
 * Created by Think on 6/29/17.
 */
public class Solution {
    public int maximumProduct(int[] nums) {
        int[] threePositiveNumbers = new int[3];
        int[] twoNegativeNumbers = new int[2];
        for (int i = 0; i < threePositiveNumbers.length; i++) {
            threePositiveNumbers[0] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < twoNegativeNumbers.length; i++) {
            twoNegativeNumbers[0] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > threePositiveNumbers[0]) {
                threePositiveNumbers[2] = threePositiveNumbers[1];
                threePositiveNumbers[1] = threePositiveNumbers[0];
                threePositiveNumbers[0] = nums[i];
            } else if (nums[i] > threePositiveNumbers[1]) {
                threePositiveNumbers[2] = threePositiveNumbers[1];
                threePositiveNumbers[1] = nums[i];
            } else if (nums[i] > threePositiveNumbers[2]) {
                threePositiveNumbers[2] = nums[i];
            }

            if (nums[i] < twoNegativeNumbers[1]) {
                twoNegativeNumbers[0] = twoNegativeNumbers[1];
                twoNegativeNumbers[1] = nums[i];
            } else if (nums[i] < twoNegativeNumbers[0]) {
                twoNegativeNumbers[0] = nums[i];
            }
        }
        int res1 = threePositiveNumbers[0] * threePositiveNumbers[1] * threePositiveNumbers[2];
        int res2 = twoNegativeNumbers[0] * twoNegativeNumbers[1] * threePositiveNumbers[0];
        return res1 > res2 ? res1: res2;
    }
}
