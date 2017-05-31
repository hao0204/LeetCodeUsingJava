package ReshapetheMatrix566;

/**
 * Created by Think on 5/31/17.
 */
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int size = 0;
        for (int i = 0; i < nums.length; ++i) {
            size += nums[i].length;
        }
        if (size != r * c) {
            return nums;
        }
        int[][] result = new int[r][c];
        int a = 0, b = 0;
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                if (b == nums[a].length) {
                    a++;
                    b = 0;
                }
                result[i][j] = nums[a][b++];
            }
        }
//        good solu.
//        for (int i = 0; i < r*c; ++i) {
//            result[i/c][i%c] = nums[i/nums[0].length][i%nums[0].length];
//        }
        return result;
    }
}
