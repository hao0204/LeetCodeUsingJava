package RangeSumQueryImmutable;

/**
 * Created by Think on 12/27/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 5));
    }
}
