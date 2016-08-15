package threeSumClosest;

public class Test {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.threeSumClosest(new int[]{-4, -1, 1, 2}, 1));
		System.out.println(solution.threeSumClosest(new int[]{1, 1, 1, 0}, -100));
		System.out.println(solution.threeSumClosest(new int[]{-2, 1, 3, 20, 80}, 70));
	}

}
