package stringToInteger;

public class Solution {
	public int myAtoi(String str) {
		int sum = 0;
		int flag = 1;
		str = str.trim();
		int i = 0;
		if (str.length() == 0)
			return sum;
		if (str.charAt(0) == '-' || str.charAt(0) == '+'){
			if (str.charAt(0) == '-')
				flag = -1;
			++i;
		}
		while(i < str.length() && Character.isDigit(str.charAt(i))){
			if (judge(flag, sum, str.charAt(i)-'0')){
				if (flag == 1)
					sum = Integer.MAX_VALUE;
				else
					sum = Integer.MIN_VALUE;
				break; 
			}
			sum = sum * 10 + (str.charAt(i) - '0');
			++i;
		}
		return flag == 1 ? sum : -sum;
    }
	public boolean judge(int flag, int sum, int digit){
		boolean result = false;
		if (flag == 1 && (sum > Integer.MAX_VALUE/10 || sum == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10))
			result = true;
		if (flag == -1 && (-sum < Integer.MIN_VALUE/10 || -sum == Integer.MIN_VALUE/10 && -digit < Integer.MIN_VALUE%10))
			result = true;
		return result;
	}
}
