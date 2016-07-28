package longestPalindromicSubstring;

public class Solution {
	
//	 public String longestPalindrome(String s) {
//		 int length = s.length();
//		 boolean[][] str = new boolean[length][length];
//		 int left = 0, right = 0, max = 0;
//		 for (int i = 0; i < length - 1; ++i){
//			 str[i][i] = true;
//			 str[i][i+1] = (s.charAt(i) == s.charAt(i+1));
//		 }
//		 str[length-1][length-1] = true;
//		 for (int i = 2; i < length; ++i){
//			 for (int j = 0; j + 1 < i; ++j ){
//				 str[j][i] = str[j+1][i-1] && s.charAt(i) == s.charAt(j);
//			 }
//		 }
//		 for (int i = 0; i < length; ++i){
//			 for (int j = i + 1; j < length; ++j){
//				 if (str[i][j] && j - i + 1 > max){
//					 left = i;
//					 right = j;
//					 max = right - left;
//				 }
//			 }
//		 }
//		 return s.substring(left, right+1);
//	 }
	public String longestPalindrome(String s) {
		int left = 0, right = 0;
		for (int i = 0; i < s.length(); ++i){
			int len1 = expand(s, i, i);
			int len2 = expand(s, i, i+1);
			int max = Math.max(len1, len2);
			if (max > right - left + 1){
				left = i- (max-1) / 2;
				right = i + max / 2;
			}
		}
		return s.substring(left, right+1);
	}
	int expand(String s, int center1, int center2){
		int i = center1, j = center2;
		int length = s.length();
		int left = 0, right = 0;
		while(i >= 0 && j < length && s.charAt(i) == s.charAt(j)){
			left = i--;
			right = j++;
		}
		return right - left + 1;
	}
}
