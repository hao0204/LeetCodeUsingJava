package CompareVersionNumbers;

/**
 * Created by Think on 12/2/16.
 */
public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int l1 = v1.length;
        int l2 = v2.length;
        int i = 0;
        for (; i < l1 && i < l2; ++i) {
            if (Integer.parseInt(v1[i]) > Integer.parseInt(v2[i]))
        		return 1;
        	else if (Integer.parseInt(v1[i]) < Integer.parseInt(v2[i]))
        		return -1;
        }
        if (l1 > l2) {
        	while (i < l1 && Integer.parseInt(v1[i]) == 0) ++i;
        	if (i == l1)
        		return 0;
        	else
        		return 1;
        }
        else if (l1 < l2) {
            while (i < l2 && Integer.parseInt(v2[i]) == 0) ++i;
        	if (i == l2)
        		return 0;
        	else
        		return -1;
        }
        else
        	return 0;
    }
}
