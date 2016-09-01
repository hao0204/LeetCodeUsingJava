package validParentheses;

import java.util.Stack;

public class Solution {
	
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean result = true;
        for (Character ch : s.toCharArray()){
        	if (ch.equals('{') || ch.equals('[') || ch.equals('(')){
        		stack.push(ch);
        	} else {
        		if (stack.isEmpty()){
        			result = false;
        			break;
        		}
        		Character p = stack.pop();
        		if (p.equals('{') && !ch.equals('}')){
        			result = false;
        			break;
        		}
        		if (p.equals('[') && !ch.equals(']')){
        			result = false;
        			break;
        		}
        		if (p.equals('(') && !ch.equals(')')){
        			result = false;
        			break;
        		}
        	}
        }
        if (!stack.isEmpty())
        	result = false;
        return result;
    }
}
