package intersectionofTwoArrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Think on 11/1/16.
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) return intersection(nums2, nums1);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        for (int i = 0; i < nums1.length; ++i)
            a.add(nums1[i]);
        for (int i = 0; i < nums2.length; ++i)
            if (a.contains(nums2[i]))
                b.add(nums2[i]);
        int[] c = new int[b.size()];
        int j = 0;
        for (Integer integer : b){
            c[j++] = integer;
        }
        return c;
    }
}
