package ExcelSheetColumnNumber;

/**
 * Created by Think on 11/13/16.
 */
public class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        int p = 1;
        for (int i = s.length()-1; i >= 0; --i){
            sum += (s.charAt(i) - 'A' + 1) * p;
            p *= 26;
        }
        return sum;
    }
}
