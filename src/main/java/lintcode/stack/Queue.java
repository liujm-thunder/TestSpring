package lintcode.stack;

import java.util.Stack;

/**
 * Created by liujianmeng on 16/9/18.
 */
public class Queue {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    public Queue() {
        // do initialization if necessary
    }

    public void push(int element) {
        stack1.push(element);
        // write your code here
    }

    public int pop() {
        // write your code here
        if (stack2.empty()) {
            while (!stack1.empty()) {
                int elem = stack1.peek();
                stack1.pop();
                stack2.push(elem);
            }
        }
        int elem2 = stack2.peek();
        stack2.pop();
        return elem2;
    }

    public int top() {
        // write your code here
        if (stack2.empty()) while (!stack1.empty()) {
            int elem = stack1.peek();
            stack1.pop();
            stack2.push(elem);
        }
        return stack2.peek();
    }
}