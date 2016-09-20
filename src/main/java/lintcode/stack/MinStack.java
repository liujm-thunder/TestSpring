package lintcode.stack;

import java.util.Stack;

/**
 * Created by liujianmeng on 16/9/18.
 */
public class MinStack {

    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MinStack() {
        // do initialize if necessary
    }

    public void push(int number) {
        // write your code here
        dataStack.push(number);
        if (minStack.size()==0||number<=minStack.peek()){
            minStack.push(number);
        }else {
            minStack.push(minStack.peek());
        }
    }

    public int pop() {
        // write your code here
        assert (dataStack.size()>0&&minStack.size()>0);
        dataStack.pop();
        return minStack.pop();
    }

    public int min() {
        // write your code here
        assert(dataStack.size() > 0 && minStack.size() > 0);
        return minStack.pop();
    }
}
