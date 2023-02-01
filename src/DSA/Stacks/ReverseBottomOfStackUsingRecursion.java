package DSA.Stacks;

import java.util.*;


public class ReverseBottomOfStackUsingRecursion {

        static int[] a;
        static int alen;
        public static void main(String args[]) {
            Stack<Integer> stack = new Stack<>();
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            while (n-- > 0)
                stack.push(s.nextInt());
            createArray(stack);
            reverseSecondHalf(stack);
        }

        // Method to reverse the last half of the elements from the bottom of the stack
        static void createArray(Stack<Integer> stack) {
            int size = stack.size();
            int median = stack.size()/2;
            a = new int[stack.size()];
            for (int i = 0; i < size; i++) {
                if (i < median) {
                    a[median-(i+1)]= stack.pop();
                } else {
                    a[i]=stack.pop();
                }
            }
            alen = a.length-1;
        }

        static void reverseSecondHalf(Stack<Integer> stack) {
            // Write your code here
            if (alen >= 0) {
                stack.push(a[alen]);
                alen--;
                reverseSecondHalf(stack);
            } else {
                System.out.println(stack);
            }
        }
    }

