package Leetcode.DSA.Stack;
// https://leetcode.com/problems/longest-valid-parentheses/description/

import java.util.Stack;

public class LongestValidParens {
    public static void main(String[] args) {
        String[] inputs = {"(()",")()())","","))())",")(","()(()()"};
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("For Input "+ inputs[i] + " Length is : " + longestValidParentheses(inputs[i]));
        }
    }

    static int longestValidParentheses(String s) {
        Stack<Character> myStack = new Stack<>();
        int count=0;
        if (s.equals(""))
            return 0;

        for (Character c: s.toCharArray()) {
                if (c==')' && !myStack.isEmpty() && myStack.peek()=='(') {
                    count+=2;
                    myStack.pop();
                } else {
                    myStack.push(c);
                }
        }
        return count;

    }
}
