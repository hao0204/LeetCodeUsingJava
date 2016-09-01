package validParentheses;

public class Test {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		System.out.println(solution.isValid("()"));
		System.out.println(solution.isValid("()[]{}"));
		System.out.println(solution.isValid("(]"));
		System.out.println(solution.isValid("([)]"));
	}

}
