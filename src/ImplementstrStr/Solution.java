package ImplementstrStr;

/**
 * Created by Think on 12/28/16.
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        int length = needle.length();
        for (int i = 0;; ++i) {
            if (haystack.substring(i).length() < length) return -1;
            if (haystack.substring(i, i+length).equals(needle)) return i;
        }
    }
}
