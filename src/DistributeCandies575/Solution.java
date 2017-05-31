package DistributeCandies575;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Think on 5/31/17.
 */
public class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int i: candies) {
            set.add(i);
        }
        return candies.length / 2 > set.size() ? set.size() : candies.length / 2;
    }
}
