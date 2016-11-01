package validAnagram;

import java.util.Arrays;

/**
 * Created by Think on 11/1/16.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];
        for (Character ch : s.toCharArray())
            a[ch - 'a'] += 1;
        for (Character ch : t.toCharArray())
            b[ch - 'a'] += 1;
        return Arrays.equals(a, b);
    }
}
