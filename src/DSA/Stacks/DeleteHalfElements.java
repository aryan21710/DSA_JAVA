package DSA.Stacks;

import java.util.*;

public class DeleteHalfElements {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack);
    }

    // Method to delete the first half of the elements from the bottom of the stackand print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        // Write your code here
        Stack<Integer>s = new Stack<>();
        int size = stack.size();
        int half=(int) Math.floor(((float)stack.size()/2));
        int[] arr = new int[size-half];
        for(int i=0; i< size; i++) {
            if (i < size-half)
                arr[size-half-i-1]=(stack.pop());
            else
                stack.pop();
        }
        System.out.print(Arrays.toString(arr)+" ");
    }
}
