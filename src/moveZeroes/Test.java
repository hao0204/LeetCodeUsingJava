package moveZeroes;

/**
 * Created by Think on 10/24/16.
 */
public class Test {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = new int[]{0,0,0,0,3};
        solution.moveZeroes(nums);
        for (int i : nums)
            System.out.print(i + " ");
    }
}
