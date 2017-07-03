package MaximumDistanceinArrays624;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 7/3/17.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> arrays = new ArrayList<>();
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        List<Integer> array3 = new ArrayList<>();
        List<Integer> array4 = new ArrayList<>();
        array1.add(-8);
        array1.add(4);
        array2.add(-2);
        array3.add(-10);
        array3.add(3);
        array4.add(2);
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);
        arrays.add(array4);
        System.out.println(solution.maxDistance(arrays));
    }
}
