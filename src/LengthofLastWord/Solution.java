package LengthofLastWord;

/**
 * Created by Think on 12/1/16.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null) return 0;
        String[] str = s.split(" ");
        if (str.length > 0)
            return str[str.length-1].length();
        else
            return 0;
    }
}
