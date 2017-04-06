package NextGreaterElementI496;

import java.util.Arrays;

/**
 * Created by Think on 4/6/17.
 */
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] res = new int[findNums.length];
        for (int i = 0; i < findNums.length; ++i) {
            A:
            for (int j = 0; j < nums.length; ++j) {
                if (findNums[i] == nums[j]) {
                    for (int k = j+1; k < nums.length; ++k) {
                        if (findNums[i] < nums[k]) {
                            res[i] = nums[k];
                            break A;
                        }
                    }
                }
                res[i] = -1;
            }
        }
        return res;
    }
}
