package IsomorphicStrings;

import java.util.HashMap;

/**
 * Created by Think on 12/1/16.
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        HashMap<Character, Integer> a = new HashMap<>();
        HashMap<Character, Integer> b = new HashMap<>();
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (a.containsKey(s.charAt(i))) {
                sb1.append(a.get(s.charAt(i)));
            } else {
                sb1.append(sum1);
                a.put(s.charAt(i), sum1);
                ++sum1;
            }
        }
        for (int i = 0; i < t.length(); ++i) {
            if (b.containsKey(t.charAt(i))) {
                sb2.append(b.get(t.charAt(i)));
            } else {
                sb2.append(sum2);
                b.put(t.charAt(i), sum2);
                ++sum2;
            }
        }
        if (sb1.toString().equals(sb2.toString()))
            return true;
        else
            return false;
    }
}
