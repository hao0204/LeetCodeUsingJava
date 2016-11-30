package RepeatedSubstringPattern;

/**
 * Created by Think on 11/30/16.
 */
public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        for (int i = len/2; i >= 1; --i){
            if (len % i == 0){
                String s = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < len / i; ++j){
                    sb.append(s);
                }
                if (sb.toString().equals(str))
                    return true;
            }
        }
        return false;
    }
}
