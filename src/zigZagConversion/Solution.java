package zigZagConversion;

public class Solution {
	
	public String convert(String s, int numRows) {
		int temp = 2 * numRows - 2;
		String result[] = new String[numRows];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numRows; ++i){
			result[i] = "";
		}
		for (int i = 0; i < s.length(); ++i){
			if (temp != 0)
				result[i%temp >= numRows ? temp-i%temp:i%temp] += s.charAt(i);
			else
				result[temp] += s.charAt(i);
		}
		for (int i = 0; i < result.length; ++i){
			sb.append(result[i]);
		}
		return sb.toString();
    }
}
