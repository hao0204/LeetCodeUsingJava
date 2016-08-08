package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
	
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> results = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; ++i){
        	int j = i+1;
        	int k = nums.length - 1;
        	while (j < k){
        		ArrayList<Integer> result = new ArrayList<>();
        		if (nums[i] + nums[j] + nums[k] == 0){
        			result.add(nums[i]);
        			result.add(nums[j]);
        			result.add(nums[k]);
        			if (set.add(result)){
        				results.add(result);
        			}
        			++j;
        			--k;
        		}else if (nums[i] + nums[j] + nums[k] > 0){
        			--k;
        		}else{
        			++j;
        		}
        	}
        }
        return results;
    }
}
