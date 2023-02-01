package Leetcode.DSA.Stack;

import java.util.ArrayList;
import java.util.HashMap;

public class DesignStackWithMinElement {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(0);
        minStack.push(-2);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.pop();
        minStack.getMin(); // return -2
    }
}


class MinStack {
    ArrayList<Integer> list = new ArrayList<>();

    private int min = Integer.MAX_VALUE;

    public boolean isEmpty() {
         return list.size() == 0;
    }

    public MinStack() {
        this.list = list;
    }

    public void push(int val) {
          if (val < min)
              min = val;
          list.add(val);
    }

    public void pop() {
        HashMap map = new HashMap();
        if (!isEmpty()) {
            list.remove(list.size()-1);
            min = Integer.MAX_VALUE;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < min)
                    min = list.get(i);
            }
        }
    }

    public int top() {
         return list.get(list.size()-1);
    }

    public int getMin() {
              return min;
    }
}


