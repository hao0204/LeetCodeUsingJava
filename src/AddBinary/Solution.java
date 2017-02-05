package AddBinary;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by Think on 2/5/17.
 */
public class Solution {
    public String addBinary(String a, String b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.length() < b.length())
            return addBinary(b, a);
        char[] a1 = a.toCharArray();
        char[] a2 = b.toCharArray();
        char flag = '0';
        int i, j;
        for (i = a1.length-1, j = a2.length-1; j >= 0; --j) {
            int tmp = (a1[i] - '0') + (a2[j] - '0') + (flag - '0');
            flag = '0';
            if (tmp > 1) {
                flag = '1';
                tmp -= 2;
            }
            a1[i--] = (char)(tmp+'0');
        }
        for (;i >= 0; --i) {
            int tmp = (a1[i] - '0') + (flag - '0');
            flag = '0';
            if (tmp > 1) {
                flag = '1';
                tmp -= 2;
            }
            a1[i] = (char)(tmp+'0');
        }
        StringBuilder sb = new StringBuilder();
        if (flag == '1')
            sb.append(flag);
        for (char ch: a1)
            sb.append(ch);
        return sb.toString();
    }
}