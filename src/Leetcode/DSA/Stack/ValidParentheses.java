package Leetcode.DSA.Stack;

// https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String[] inputs = {"()","{}","[]","(){}[]","(}","((())","][()","}{","([]{}){","]","(])","[])"};
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("For Input "+ inputs[i] + " Is The String Valid :--" + isValid(inputs[i]));
        }
    }

    static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        if (s.charAt(0)==']' || s.charAt(0)=='}' || s.charAt(0)==')')
        return false;

        if (s.charAt(s.length()-1)=='[' || s.charAt(s.length()-1)=='{' || s.charAt(s.length()-1)=='(')
            return false;
        for (Character c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                myStack.push(c);
            else {
                if (myStack.isEmpty())
                    return false;
                if (myStack.peek()=='(' && c==')' || myStack.peek()=='[' && c==']' || myStack.peek()=='{' && c=='}') {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }
        return myStack.isEmpty() ? true : false;
    }
}
