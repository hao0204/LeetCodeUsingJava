package GuessNumberHigherorLower;

/**
 * Created by Think on 12/5/16.
 */
public class Solution {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(true) {
            int mid = start+(end-start) /2;
            int temp = guess(mid);
            if(temp == 0)
                return mid;
            if(temp == -1)
                end = mid-1;
            else
                start = mid+1;
        }
    }

    public int guess(int num) {
        if (num > 2)
            return -1;
        else if (num < 2)
            return 1;
        else
            return 0;

    }

}
