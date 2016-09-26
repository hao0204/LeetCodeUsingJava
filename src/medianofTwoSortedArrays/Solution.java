package medianofTwoSortedArrays;

public class Solution {
	//时间复杂度不符合题目要求，看discuss
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] nums3 = new int[nums1.length + nums2.length];
		while (i < nums1.length && j < nums2.length && k <= nums3.length/2){
			if (nums1[i] <= nums2[j])
				nums3[k++] = nums1[i++];
			else
				nums3[k++] = nums2[j++];
		}
		while (i < nums1.length && k <= nums3.length/2){
			nums3[k++] = nums1[i++];
		}
		while (j < nums2.length && k <= nums3.length/2){
			nums3[k++] = nums2[j++];
		}
		if (nums3.length % 2 == 0)
			return (nums3[nums3.length/2-1]+nums3[nums3.length/2]) / 2.0;
		else
			return nums3[nums3.length/2];
	}
}
