package HappyNumber;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Think on 11/6/16.
 */
public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            n = value(n);
            if (n == 1)
                return true;
            else
                if (set.contains(n))
                    return false;
                else
                    set.add(n);
        }
    }
    public int value(int n){
        int sum = 0;
        while (n > 0){
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
