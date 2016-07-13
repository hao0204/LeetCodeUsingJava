package TwoSum;

import java.util.HashMap;

public class Solution {
	
	/**
	 * time complexity O(n^2)
	 * @param nums
	 * @param target
	 * @return
	 */
//	public static int[] twoSum(int[] nums, int target) {
//        int[] answer = new int[2];
//        A:for (int i = 0; i < nums.length; ++i){
//        	answer[0] = i;
//        	int b = target - nums[i];
//        	for (int j = i + 1; j < nums.length; ++j){
//        		if (nums[j] == b){
//        			answer[1] = j;
//        			break A;
//        		}
//        	}
//        }
//        return answer;
//    }
	
	/**
	 * using map to make time complexity O(n)
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		int[] answer = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; ++i){
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; ++i){
			int b = target - nums[i];
			if (map.containsKey(b) && i != map.get(b))
				return new int[]{i, map.get(b)};
		}
		return answer;
	}
}
