package threeSumClosest;

import java.util.Arrays;

public class Solution {
	
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int sum = nums[0] + nums[1] + nums[2];
		int length = nums.length;
		for (int i = 0; i < length-2; ++i){
			int j = i+1, k = length-1;
			while(j < k){
				int temp = nums[i] + nums[j] + nums[k];
				if (temp == target)
					return temp;
				if (Math.abs(temp - target) < Math.abs(sum - target)){
					sum = temp;
				}
				if (temp > target)
					--k;
				else
					++j;
			}
		}
		return sum;
    }
}
