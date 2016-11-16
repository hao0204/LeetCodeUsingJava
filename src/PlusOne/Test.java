package PlusOne;

/**
 * Created by Think on 11/16/16.
 */
public class Test {
    public static void main (String[] args) {
        Solution solution = new Solution();
        int[] a = solution.plusOne(new int[]{9,9,9});
        for (int b : a)
            System.out.println(b);
    }
}
