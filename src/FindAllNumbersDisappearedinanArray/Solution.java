package FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 12/23/16.
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0)
                nums[val] = -nums[val];
        }
        for (int i = 0; i < nums.length; ++i)
            if (nums[i] >= 0)
                res.add(i+1);
        return res;
    }
}
