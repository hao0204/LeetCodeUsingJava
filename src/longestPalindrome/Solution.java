package longestPalindrome;

/**
 * Created by Think on 11/2/16.
 */
public class Solution {
    public int longestPalindrome(String s) {
        char[] chs = s.toCharArray();
        int[] res = new int[100];
        for (char ch : chs){
            res[ch - 'A'] += 1;
        }
        int sum = 0;
        int flag = 0;
        for (int i : res){
            sum += i / 2;
            if (i % 2 !=0 )
                flag = 1;
        }
        return sum*2+flag;
    }
}
