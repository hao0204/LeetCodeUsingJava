package findTheDifference;

import java.util.Arrays;

public class Solution {
	public char findTheDifference(String s, String t) {
        char[] a = s.toCharArray();       
        char[] b = t.toCharArray();
        int i = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (i = 0; i < a.length; ++i){
        	if (a[i] != b[i])
        		return b[i];
        }
        return b[i];
    }
}