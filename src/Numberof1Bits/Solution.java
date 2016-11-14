package Numberof1Bits;

/**
 * Created by Think on 11/14/16.
 */
public class Solution {
    public int hammingWeight(int n) {
        int sum = 0;
        String s = Integer.toBinaryString(n);
        for (char ch: s.toCharArray()){
            if (ch == '1')
                ++sum;
        }
        return sum;
    }
}
