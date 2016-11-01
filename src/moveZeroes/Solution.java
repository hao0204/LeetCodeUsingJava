package moveZeroes;

/**
 * Created by Think on 10/24/16.
 */
public class Solution {
//    public void moveZeroes(int[] nums) {
//        for (int i =0; i < nums.length; ++i){
//            for (int j = i+1; j < nums.length; ++j){
//                if (nums[i] == 0 && nums[j] != 0){
//                    int temp = nums[j];
//                    nums[j] = 0;
//                    nums[i] = temp;
//                }
//            }
//        }
//    }

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] != 0)
                nums[j++] = nums[i];
        }
        for (;j < nums.length; ++j)
            nums[j] = 0;
    }
}
