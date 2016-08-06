package containerWithMostWater;

public class Solution {
	
	public int maxArea(int[] height) {
        int length = height.length;
		int maxArea = -1;
		int i = 0, j = length-1;
		while(i < j){
			maxArea = Math.max(maxArea, (j-i) * Math.min(height[i], height[j]));
			if (height[i] < height[j])
				++i;
			else
				--j;
		}
		return maxArea;
	}
}
