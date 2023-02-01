package DSA.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Merge2SortedStackInto1Stack {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        String inputString="(a+((b+c))))+a";
        for(int k=1;k<inputString.length()-1;k++) {
            stack.push(inputString.charAt(k+1));
            if(inputString.charAt(k+1)==')'&& !stack.isEmpty())
                stack.pop();
            if(inputString.charAt(k-1)=='(' && !stack.isEmpty())
                stack.pop();
        }
        while (!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
