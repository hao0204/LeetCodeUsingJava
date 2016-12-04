package ExcelSheetColumnTitle;

import java.util.LinkedList;

/**
 * Created by Think on 12/4/16.
 */
public class Solution {
    public String convertToTitle(int n) {
        LinkedList<Character> res = new LinkedList();
        while(n > 26) {
            int a = (n-1) % 26;
            n = (n-1) / 26;
            res.add(0, new Character((char) ('A'+a)));
        }
        res.add(0, new Character((char) ('A'+n-1)));
        StringBuilder sb = new StringBuilder();
        for (Character ch : res) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
