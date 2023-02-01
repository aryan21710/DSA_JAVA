package DSA.Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StacksPushUsing2Queues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    Queue<Integer> temp = new LinkedList<Integer>();


    public static void main(String[] args) {
        StacksPushUsing2Queues myStack = new StacksPushUsing2Queues();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.pop();
        myStack.push(40);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
    }

    public void push(int elem) {
        q1.add(elem);
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        temp = q1;
        q1 = q2;
        q2 = temp;

    }

    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("STACK UNDERFLOW");
            return -1;
        }
        return q1.remove();
    }

}
