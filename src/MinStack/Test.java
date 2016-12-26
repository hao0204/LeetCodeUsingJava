package MinStack;

/**
 * Created by Think on 12/26/16.
 */
public class Test {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.println(param_3 + " " + param_4);
    }
}
