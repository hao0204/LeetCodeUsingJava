package NthDigit;

import java.util.ArrayList;

/**
 * Created by Think on 2/4/17.
 */
public class Solution {
    public int findNthDigit(int n) {
        ArrayList<Integer> layer = new ArrayList<>();
        layer.add(0);
        int  p = 1;
        for (int i = 1; ; ++i) {
            if (9 * i < Integer.MAX_VALUE / p) {
                layer.add(layer.get(i-1) + 9 * p * i);
                p *= 10;
            }
            else
                break;
        }
        int index = 0;
        int i = 0;
        for (; i < layer.size()-1; ++i) {
            if (n > layer.get(i) && n <= layer.get(i+1)) {
                index = i + 1;
                break;
            }
        }
        if (n > layer.get(layer.size()-1))
            index = i+1;
        int a = n - layer.get(index-1);
        int b = (a-1) / index;
        int c = (a-1) % index;
        p = 1;
        while(index > 1) {
            p *= 10;
            --index;
        }
        while(b-- > 0)
            ++p;
        return Integer.valueOf(String.valueOf(p).substring(c,c+1));
    }
}
