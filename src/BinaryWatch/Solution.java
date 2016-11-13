package BinaryWatch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 11/12/16.
 */
public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        int[] nums1 = {1, 2, 4, 8};
        int[] nums2 = {1, 2, 4, 8, 16, 32};
        for (int i = 0; i <= num; ++i){
            List<Integer> list1 = generate(nums1, i);
            List<Integer> list2 = generate(nums2, num-i);
            for (int n1: list1){
                if (n1 >= 12)
                    continue;
                for (int n2: list2){
                    if (n2 >= 60)
                        continue;
                    res.add(n1 + ":" + (n2 < 10 ? "0"+n2: n2));
                }
            }
        }
        return res;
    }
    public List<Integer> generate(int[] nums, int count){
        List<Integer> r = new ArrayList<>();
        generateP(nums, count, 0, 0,r);
        return r;
    }
    public void generateP(int[] nums, int count, int pos, int sum, List<Integer> res){
        if (count == 0){
            res.add(sum);
        }
        for (int i = pos; i < nums.length; ++i){
            generateP(nums, count-1, i+1, sum+nums[i], res);
        }
    }
}
