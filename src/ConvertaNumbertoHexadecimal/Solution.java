package ConvertaNumbertoHexadecimal;

/**
 * Created by Think on 11/9/16.
 */
public class Solution {
    public String toHex(int num) {
        char map[] = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b' ,'c', 'd', 'e', 'f'};
        if (num == 0) return "0";
        String str = "";
        while (num != 0){
            str = map[num & 15] + str;
            num = num >>> 4;
        }
        return str;
    }
}
