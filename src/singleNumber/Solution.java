package singleNumber;

import java.util.HashMap;

public class Solution {
	public int singleNumber(int[] nums) {       
		HashMap<Integer, Integer> result = new HashMap<>();
		for (int i = 0; i < nums.length; ++i){
			if (result.containsKey(nums[i]))
				result.remove(nums[i]);
			else
				result.put(nums[i], 1);
		}
		return result.entrySet().iterator().next().getKey();
	}
}