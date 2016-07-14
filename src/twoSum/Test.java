package twoSum;

public class Test {

	public static void main(String[] args) {
		Solution solution =  new Solution();
		int[] nums = {2, 7, 11, 15};
		int[] d = solution.twoSum(nums, 9);
		System.out.println(d[0] + " " + d[1]);
	}

}
