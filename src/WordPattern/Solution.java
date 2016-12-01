package WordPattern;

import java.util.HashMap;

/**
 * Created by Think on 12/1/16.
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> res1 = new HashMap<>();
        HashMap<String, Character> res2 = new HashMap<>();
        String[] strs = str.split(" ");
        char[] patterns = pattern.toCharArray();
        if (patterns.length != strs.length)
            return false;
        for (int i = 0; i < patterns.length; ++i) {
            if(res1.containsKey(patterns[i])) {
                if (!strs[i].equals(res1.get(patterns[i])))
                    return false;
            } else {
                if (res2.containsKey(strs[i])){
                    return false;
                }
                res1.put(patterns[i], strs[i]);
                res2.put(strs[i], patterns[i]);
            }
        }
        return true;
    }
}
