package lintcode.stack;

import java.util.Stack;

/**
 * Created by liujianmeng on 16/9/18.
 */
public class Kuohao {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public static boolean isValidParentheses(String s) {
        if (s.isEmpty()) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (whatParent(s.charAt(i)) < 0) {
                stack.push(s.charAt(i));
            } else if (whatParent(s.charAt(i)) > 0) {
                if (stack.empty()) {
                    return false;
                }
                if (whatParent(stack.peek()) + whatParent(s.charAt(i)) == 0) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
    static int whatParent(char ch) {
        switch (ch) {
            case '(':
                return -1;
            case ')':
                return 1;
            case '[':
                return -2;
            case ']':
                return 2;
            case '{':
                return -3;
            case '}':
                return 3;
            default:
                break;
        }
        return 0;
    }


    public static void main(String[] args) {
        String string = "()()()(){}{}{}{}[}";
        System.out.println(isValidParentheses(string));
    }
}
