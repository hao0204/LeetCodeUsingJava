package DetectCapital520;

/**
 * Created by Think on 4/6/17.
 */
public class Solution {
    public boolean detectCapitalUse(String word) {
        char[] chs = word.toCharArray();
        int count = 0;
        for (char ch: chs) {
            if (Character.isUpperCase(ch))
                count++;
        }
        return count == 0 || count == chs.length || (count == 1 && Character.isUpperCase(chs[0]));
    }
}
