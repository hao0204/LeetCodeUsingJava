package ReverseWordsinaStringIII557;

/**
 * Created by Think on 5/31/17.
 */
public class Solution {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str: temp) {
            sb.append(new StringBuilder(str).reverse() + " ");
        }
        return sb.toString().substring(0, sb.toString().length()-1);
    }
}
