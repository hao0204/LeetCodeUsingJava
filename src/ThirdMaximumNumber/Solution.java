package ThirdMaximumNumber;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Created by Think on 12/28/16.
 */
public class Solution {
    public int thirdMax(int[] nums) {
        int key = 0;
        Set<Integer> data = new HashSet<>();
        PriorityQueue<Integer> res = new PriorityQueue<>();
        for(int i = 0; i < nums.length; ++i) {
            if(!data.contains(nums[i])) {
                data.add(nums[i]);
                res.offer(nums[i]);
                if (res.size() > 3)
                    data.remove(res.poll());
            }
        }
        if (res.size() < 3) {
            while (res.size() > 1)
                res.poll();
        }
        return res.peek();
    }
}
