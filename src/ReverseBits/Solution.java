package ReverseBits;

/**
 * Created by Think on 12/28/16.
 */
public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            int a = n & 1;
            n = n >>> 1;
            result = (result << 1) + a; // or result = result << 1 | a;
        }
        return result;
    }
}
