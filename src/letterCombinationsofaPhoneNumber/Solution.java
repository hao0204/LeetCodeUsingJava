package letterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public List<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < digits.length(); ++i){
        	result = generate(result, digits.charAt(i)-'0');
        }
        return result;
    }
	
	public ArrayList<String> generate(ArrayList<String> result, int index){
		ArrayList<String> temp = new ArrayList<>();
		String[] map = new String[]{"?", "?","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		String str = map[index];
		if (result.size() == 0){
			for (int i = 0; i < str.length(); ++i){
				temp.add(""+str.charAt(i));
			}
		}else{
			for (int i = 0; i < result.size(); ++i){
				for (int j = 0; j < str.length(); ++j ){
					temp.add(result.get(i) + str.charAt(j));
				}
			}
		}
		return temp;
	}
 }
