package RelativeRanks506;

/**
 * Created by Think on 4/7/17.
 */
public class Test {
    public static void main (String[] args) {
        Solution solution = new Solution();
        for (String str: solution.findRelativeRanks(new int[]{10,3,8,9,4})) {
            System.out.println(str);
        }
    }
}
