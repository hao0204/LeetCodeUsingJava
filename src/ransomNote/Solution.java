package ransomNote;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 11/1/16.
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> a = new ArrayList<>();
        for (Character ch : magazine.toCharArray())
            a.add(ch);
        for (Character ch : ransomNote.toCharArray())
            if (!a.remove(ch))
                return false;
        return true;
    }
}
