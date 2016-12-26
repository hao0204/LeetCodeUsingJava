package MinStack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Think on 12/26/16.
 */
public class MinStack {
    /** initialize your data structure here. */
    private int min;
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (min >= x) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (min == stack.pop())
            min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
