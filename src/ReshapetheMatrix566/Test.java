package ReshapetheMatrix566;

/**
 * Created by Think on 5/31/17.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] result = solution.matrixReshape(new int[][]{{1,2},{3,4}}, 1, 4);
        for (int i = 0; i < result.length; ++i) {
            for (int j = 0; j < result[i].length; ++j) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
