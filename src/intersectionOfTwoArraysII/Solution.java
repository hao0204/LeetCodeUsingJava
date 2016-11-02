package intersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 11/2/16.
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) return intersect(nums2, nums1);
        List<Integer> a = new ArrayList<>(nums1.length);
        List<Integer> b = new ArrayList<>();
        for (int num : nums1)
            a.add(num);
        for (int num : nums2){
            if (a.remove(new Integer(num))){
                b.add(num);
            }
        }
        int[] res = new int[b.size()];
        int j = 0;
        for (Integer i : b)
            res[j++] = i;
        return res;
    }
}
