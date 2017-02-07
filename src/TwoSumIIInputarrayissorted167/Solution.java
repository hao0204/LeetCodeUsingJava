package TwoSumIIInputarrayissorted167;

/**
 * Created by Think on 2/7/17.
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int left = 0, right = numbers.length-1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target)
                break;
            if (numbers[left] + numbers[right] > target)
                --right;
            if (numbers[left] + numbers[right] < target)
                ++left;
        }
        return new int[]{left+1, right+1};
    }
}
