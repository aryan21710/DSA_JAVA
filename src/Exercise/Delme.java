package Exercise;

import java.util.*;

public class Delme {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < 11; i++) {
            queue.add(i);
        }
        int count=0;
        while (!queue.isEmpty()){
            if(stack.isEmpty() || stack.peek()>queue.peek()){
                int x=queue.remove();
                stack.push(x);

            }
            else
            {
                stack.pop();
            }
            count++;
        }
        System.out.println(count);

    }


}
