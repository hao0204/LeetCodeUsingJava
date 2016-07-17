package longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	
	//time complexity: O(n^3). time limit exceeded.
//	public int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//        int length2 = s.length();
//        int index = -1;
//        int j = 0;
//        for (int i = 0; i < length2;){
//        	StringBuilder sb = new StringBuilder();
//            sb.append(s.charAt(i));
//        	for (j = i + 1; j < length2; ++j){
//        		index = sb.indexOf("" + s.charAt(j));
//        		if (index == -1)
//        			sb.append(s.charAt(j));
//        		else
//        			break;
//        	}
//        	if (sb.length() > maxLength)
//        		maxLength = sb.length();
//        	i = i + index + 1;
//        	if (j == length2)
//        		break;
//        }
//        return maxLength;
//    }
	
	//step of 1
//	public int lengthOfLongestSubstring(String s) {
//		int maxLength = 0;
//		int length = s.length();
//		int left = 0, right = 0;
//		HashSet<Character> hashSet = new HashSet<>();
//		while(left < length && right < length){
//			if (hashSet.contains(s.charAt(right))){
//				hashSet.remove(s.charAt(left++));
//			}else{
//				hashSet.add(s.charAt(right++));
//				maxLength = Math.max(maxLength, right - left);
//			}
//		}
//		return maxLength;
//	}
	
	public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		int length = s.length();
		int i = 0, j = 0;
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (; j < length; ++j){
			if (hashMap.containsKey(s.charAt(j))){
				i = Math.max(hashMap.get(s.charAt(j)) + 1, i);
			}
			maxLength = Math.max(maxLength, j - i + 1);
			hashMap.put(s.charAt(j), j);
		}
		return maxLength;
	}
}