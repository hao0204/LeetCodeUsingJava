package RemoveElement;

/**
 * Created by Think on 11/16/16.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int i = 0, j = nums.length - 1;
        while (true){
            while (i < nums.length && nums[i] != val)
                ++i;
            while (j >=0 && nums[j] == val)
                --j;
            if (i >= j)
                break;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int sum = 0;
        for (int a: nums){
            if (a == val)
                break;
            ++sum;
        }
        return sum;
    }
}
