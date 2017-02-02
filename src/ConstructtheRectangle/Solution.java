package ConstructtheRectangle;

/**
 * Created by Think on 2/2/17.
 */

//have a good idea: think w first, then cal area/w
public class Solution {
    public int[] constructRectangle(int area) {
        int L = 0, W = 0;
        for (int i = (int)(Math.sqrt(area)); i <= area; ++i) {
            if (area % i == 0) {
                W = area / i;
                L = i;
                if (L < W)
                    continue;
                break;
            }
        }
        return new int[]{L, W};
    }
}
