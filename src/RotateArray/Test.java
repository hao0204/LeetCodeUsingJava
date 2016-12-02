package RotateArray;

/**
 * Created by Think on 12/2/16.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[]{1,2,3,4,5,6};
        solution.rotate(a, 2);
        for (int i: a)
            System.out.println(i);
    }
}
