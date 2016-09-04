package isSubsequence;

public class Solution {
	
	public boolean isSubsequence(String s, String t) {
		if (s.length() == 0) return true;
        int index = t.indexOf(s.charAt(0));
		if (index != -1){
			if (s.length() == 1)
				return true;
			else
				return isSubsequence(s.substring(1), t.substring(index+1));
		}else
			return false;
    }
}
