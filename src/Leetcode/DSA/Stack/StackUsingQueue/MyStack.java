package Leetcode.DSA.Stack.StackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> q1=new LinkedList<>();

    public MyStack() {
        q1.clear();
    }

        public static void main(String[] args) {
             MyStack obj = new MyStack();
             obj.push(1);
             obj.push(2);
             obj.push(3);
             obj.push(4);
             obj.push(2);
             int top=obj.top();
            System.out.println("top"+top);
            int popped=obj.pop();
            System.out.println("popped"+popped);

            top=obj.top();
            System.out.println("top"+top);
        }


        public void push(int x) {
           q1.add(x);
           int popCount=0;
           while(popCount < q1.size()-1) {
               q1.add(q1.remove());
               popCount++;
           }

        }

        public int pop() {
            if (!empty()) {
                return q1.remove();
            }
            return -1;
        }

        public int top() {
              if (empty())
                  return -1;
              return q1.peek();
        }

        public boolean empty() {
            return q1.size()==0;
        }


}
