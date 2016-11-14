package ArrangingCoins;

/**
 * Created by Think on 11/14/16.
 */
public class Solution {
    public int arrangeCoins(int n) {
        if (n == 0) return 0;
        int i;
        for (i = 1;; ++i){
            n = n - i;
            if (n <= 0 || n < i+1)
                break;
        }
        return i;
    }
}
