package PascalsTriangleII119;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 8/17/17.
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex < 0) {
            return list;
        }
        for (int i = 0; i < rowIndex+1; i++) {
            int temp = 0;
            for (int j = 0; j < list.size(); j++) {
                int res = list.get(j)+temp;
                temp = list.get(j);
                list.set(j, res);
            }
            list.add(1);
        }
        return list;
    }
}
