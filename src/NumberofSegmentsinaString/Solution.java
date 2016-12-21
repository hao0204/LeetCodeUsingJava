package NumberofSegmentsinaString;

/**
 * Created by Think on 12/21/16.
 */
public class Solution {
    public int countSegments(String s) {
        if (s.trim().length() == 0) return 0;
        return s.trim().replaceAll("\\s{2,}", " ").split(" ").length;
    }
}
