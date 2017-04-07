package LongestUncommonSubsequenceI521;

/**
 * Created by Think on 4/7/17.
 */
public class Solution {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1: Math.max(a.length(), b.length());
    }
}
