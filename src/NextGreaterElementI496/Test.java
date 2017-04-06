package NextGreaterElementI496;

/**
 * Created by Think on 4/6/17.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i : solution.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4})) {
            System.out.println(i);
        }
    }
}
