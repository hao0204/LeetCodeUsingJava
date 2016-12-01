package ValidPalindrome;

/**
 * Created by Think on 12/1/16.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i)
            if (Character.isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        if (sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase()))
            return true;
        else
            return false;
    }
}
