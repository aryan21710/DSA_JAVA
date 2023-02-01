package DSA.Stacks.AscendingSort;
import java.util.*;

public class Source {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        // Write your code here
        int[] arr=new int[stack.size()];
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            arr[i]=stack.pop();
        }
        Arrays.sort(arr);
        for (int i=0; i< arr.length;i++) {
            stack.push(arr[i]);
        }
        System.out.print(stack);
    }
}