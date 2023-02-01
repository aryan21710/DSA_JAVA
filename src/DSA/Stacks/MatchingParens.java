package DSA.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MatchingParens {
    static Stack<Character>myStack= new Stack();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(match(in.nextLine()));
    }

    static boolean match(String s) {
        int count=0;
        if (s.toCharArray()[0]==')') return false;
        for (char c: s.toCharArray())
            myStack.push(c);

        while(!myStack.isEmpty()) {
            if (myStack.peek()==')') {
                count++;
            } else if (myStack.peek()=='('){
                count--;
            }
            myStack.pop();
        }

        return count == 0 ? true : false;
    }
}
