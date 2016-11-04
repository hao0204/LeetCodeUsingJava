package PowerofTwo;

/**
 * Created by Think on 11/4/16.
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while(n % 2 == 0 && n != 1){
            n = n / 2;
        }
        if (n == 1) return true;
        else return false;
    }
}
