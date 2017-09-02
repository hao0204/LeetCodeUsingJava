package TeemoAttacking495;

/**
 * Created by Think on 9/2/17.
 */
public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }
        int sum = 0;
        int pre = timeSeries[0];
        for (int i = 1; i < timeSeries.length; ++i) {
            if (timeSeries[i]-pre+1 > duration) {
                sum += duration;
            } else if (timeSeries[i]-pre+1 <= duration) {
                sum += timeSeries[i]-pre;
            }
            pre = timeSeries[i];
        }
        return sum+duration;
    }
}
