package DSA.Stacks;

import java.util.*;

public class Source {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromStart(stack);
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        // Write your code here

        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
        }

        try {

                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                System.out.println(stack.pop());

        } catch(Exception e) {
            System.out.print("There are not enough elements in the stack");
        }

    }

    static void printFifthElementFromStart(Stack<Integer> stack) {
        // Write your code here
        int count=stack.size()-5;

        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
        }

        if (stack.size() < 5) {
            System.out.print("There are not enough elements in the stack");
            return;
        }

            while(count > 0) {
                stack.pop();
                count-=1;
            }
            System.out.println(stack.pop());

    }
}