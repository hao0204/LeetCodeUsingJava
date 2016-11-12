package MinimumMovestoEqualArrayElements;

/**
 * Created by Think on 11/12/16.
 */
public class Test {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.minMoves(new int[]{1,2147483647}));
        System.out.println(solution.minMoves(new int[]{1,1,3}));
        System.out.println(solution.minMoves(new int[]{1,10,100}));
    }
}
