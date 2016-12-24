package HammingDistance;

/**
 * Created by Think on 12/23/16.
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        return Integer.bitCount(a);
    }
}
