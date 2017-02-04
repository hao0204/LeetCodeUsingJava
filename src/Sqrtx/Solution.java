package Sqrtx;

/**
 * Created by Think on 2/4/17.
 */
public class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        int a = 0;
        int b = x;
        int c = 0;
        int tmp1 = 0;
        int tmp2 = 0;
        while(true) {
            c = (a + b) / 2; // c = a + (b-a)/2
            tmp1 = x / c;
            tmp2 = x / (c + 1);
            if (tmp1 >= c && tmp2 < c+1)
                return c;
            else if (tmp2 == (c+1))
                return c+1;
            else if (c+1 < tmp2) {
                a = c;
            }
            else {
                b = c;
            }
        }
    }
}
