package PlusOne;

/**
 * Created by Think on 11/16/16.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        for (int i = digits.length - 1; i > 0; --i){
            if (digits[i] >= 10) {
                digits[i] -= 10;
                ++digits[i-1];
            }
        }
        if (digits[0] >= 10) {
            int[] d = new int[digits.length + 1];
            d[0] = 1;
            d[1] = digits[0] - 10;
            for (int i = 1; i < digits.length; ++i) {
                d[i+1] = digits[i];
            }
            return d;
        }else
            return digits;
    }
}
