package AssignCookies;

import java.util.Arrays;

/**
 * Created by Think on 11/30/16.
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int sum = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length;){
            if (g[i] > s[j]) ++j;
            else {
                ++i;
                ++j;
                ++sum;
            }
        }
        return sum;
    }
}
