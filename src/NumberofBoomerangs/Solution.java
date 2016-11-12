package NumberofBoomerangs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Think on 11/12/16.
 */
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        if (points.length == 0 || points[0].length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < points.length; ++i){
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; ++j){
                if (i == j) continue;
                int dis = (points[i][0] - points[j][0])*(points[i][0] - points[j][0])
                        +(points[i][1] - points[j][1])*(points[i][1] - points[j][1]);
                if (!map.containsKey(dis))
                    map.put(dis, 1);
                else
                    map.put(dis, map.get(dis) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if (entry.getValue() >= 2)
                    sum += entry.getValue() * (entry.getValue()-1);
            }
        }
        return sum;
    }
}
