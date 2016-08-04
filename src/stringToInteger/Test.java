package stringToInteger;

public class Test {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.myAtoi("100000000000000000"));
		System.out.println(solution.myAtoi("+-1"));
		System.out.println(solution.myAtoi("-100000000000000"));
		System.out.println(solution.myAtoi("     010"));
		System.out.println(solution.myAtoi("  -0012a42"));
		System.out.println(solution.myAtoi("   +0 123"));
		System.out.println(solution.myAtoi("    10522545459"));
		System.out.println(solution.myAtoi(""));
	}

}
