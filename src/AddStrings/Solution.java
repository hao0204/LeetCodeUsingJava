package AddStrings;


/**
 * Created by Think on 11/4/16.
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        if (len1 < len2) return addStrings(num2, num1);
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int i, j;
        for (i = len1 - 1, j = len2 - 1; j > 0;--j, --i){
            int a = n1[i] - '0' + n2[j] - '0';
            if (a >= 10) {
                n1[i] = (char) (a - 10 + '0');
                n1[i-1] = (char)(n1[i-1] - '0' + 1 + '0');
            }else {
                n1[i] = (char) (a + '0');
            }
        }
        n1[i] = (char)(n1[i] - '0' + n2[j] - '0' + '0');
        for (;i > 0;--i){
            int a = n1[i] - '0';
            if (a >= 10){
                n1[i] = (char)(a - 10 + '0');
                n1[i-1] = (char)(n1[i-1] - '0' + 1 + '0');
            }
        }
        String str = "";
        if (n1[i] - '0' >= 10){
            str += "1";
            n1[i] = (char)(n1[i] - '0' - 10 + '0');
        }
        return str + String.valueOf(n1);
    }

}
