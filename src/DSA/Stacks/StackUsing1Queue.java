package DSA.Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing1Queue {
    Queue<Integer> Q = new LinkedList();

    public static void main(String[] args) throws Exception {
        StackUsing1Queue myStack = new StackUsing1Queue();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.pop();
        myStack.pop();
        myStack.push(30);
        myStack.push(40);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
    }

    public void push(int elem) {
        if (Q.isEmpty()) {
            Q.add(elem);
        } else {
            Q.add(elem);
            int iterator = Q.size()-1;
            while(iterator > 0) {
                Q.add(Q.remove());
                iterator--;
            }
        }
    }

    public int pop() throws Exception {
        if (Q.isEmpty()) throw new Exception("STACK UNDERFLOW");
        return Q.remove();
    }
}
