package FirstBadVersion;

import java.math.BigDecimal;

/**
 * Created by Think on 12/4/16.
 */
public class Solution {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end){
            int mid = start + (end-start)/2;
            if (isBadVersion(mid) == false) start = mid+1;
            else end = mid;
        }
        return start;
    }

    public Boolean isBadVersion(int version) {
        if (version >= 11)
            return true;
        else
            return false;
    }
}
