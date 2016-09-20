package lintcode.stack;

import java.util.Stack;

/**
 * Created by liujianmeng on 16/9/18.
 */
public class Nibolan {
    /**
     * @param tokens The Reverse Polish Notation
     * @return the value
     */
    public int evalRPN(String[] tokens) {
        // Write your code here
        if (tokens.length == 0) return 0;
        int result = 0;
        int a1 = 0;
        int a2 = 0;
        Stack<Integer> integerStack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                a1 = integerStack.pop();
                a2 = integerStack.pop();
                integerStack.push(a2 + a1);
            } else if (tokens[i].equals("-")) {
                a1 = integerStack.pop();
                a2 = integerStack.pop();
                integerStack.push(a2 - a1);
            } else if (tokens[i].equals("*")) {
                a1 = integerStack.pop();
                a2 = integerStack.pop();
                integerStack.push(a2 * a1);
            } else if (tokens[i].equals("/")) {
                a1 = integerStack.pop();
                a2 = integerStack.pop();
                integerStack.push(a2 / a1);
            } else {
                integerStack.push(Integer.valueOf(tokens[i]));
            }
        }
        result = integerStack.peek();
        return result;
    }


}
