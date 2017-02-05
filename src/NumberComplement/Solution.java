package NumberComplement;

/**
 * Created by Think on 2/5/17.
 */
public class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        char[] s = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; ++i)
            sb.append((char)(1 - (s[i]-'0') + '0'));
        return Integer.valueOf(sb.toString(), 2);
    }
}
