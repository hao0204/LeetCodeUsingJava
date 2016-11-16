package ReverseVowelsofaString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 11/16/16.
 */
public class Solution {
    public String reverseVowels(String s) {
        final int[] vowels = new int[200];
        vowels['a'] = 1;
        vowels['e'] = 1;
        vowels['i'] = 1;
        vowels['o'] = 1;
        vowels['u'] = 1;
        vowels['A'] = 1;
        vowels['E'] = 1;
        vowels['I'] = 1;
        vowels['O'] = 1;
        vowels['U'] = 1;
        List<Character> vs = new ArrayList<>();
        for (char ch: s.toCharArray()){
            if (vowels[ch] == 1){
                vs.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 1; i < s.length(); ++i){
            if (vowels[s.charAt(i)] == 1){
                sb.append(vs.get(vs.size() - j++));
            }else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
