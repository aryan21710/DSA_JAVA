package DSA.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class FindKthLargestElement {
    // This function returns the sorted stack
    public static Stack < Integer > sortStack(Stack < Integer > input) {
        //write your code here

        int size = input.size();
        for (int i = 0; i < size; i++) {
            int min=Integer.MAX_VALUE;
            Stack<Integer> temp = new Stack<>();
            for (int j = 0; j < size-i; j++) {
                if (input.peek() < min)
                    min=input.peek();
                temp.push(input.pop());
            }
            input.push(min);
            int tempSize= temp.size();
            for (int j = 0; j < tempSize; j++) {
                if (temp.peek()!=min)
                    input.push(temp.pop());
                else
                    temp.pop();
            }
        }
        return input;
    }

    public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
        int size=sortedStack.size();
        for (int i = 0; i < size; i++) {
            if (i==k-1)
                System.out.println(sortedStack.pop());
            else
                sortedStack.pop();
        }
        //write your code here
    }


    public static void main(String args[]) {
        Stack< Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add( in .nextInt());
        }

        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }

        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }

        // This is the temporary stack

        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);

    }
}




