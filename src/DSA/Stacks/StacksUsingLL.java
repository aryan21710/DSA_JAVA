package DSA.Stacks;

import java.util.LinkedList;

public class StacksUsingLL {
    private static LinkedList<Integer> list = new LinkedList<>();
    public static void main(String[] args) {
        StacksUsingLL mystack = new StacksUsingLL();
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.show();
        mystack.show();
        int topElem= mystack.peek();
        System.out.println("\nTop Element of stack "+topElem);
        int popped=mystack.pop();
        System.out.println("\npopped "+popped);
        mystack.show();
        popped=mystack.pop();
        System.out.println("\npopped "+popped);
        mystack.show();
        popped=mystack.pop();
        System.out.println("\npopped "+popped);
        mystack.show();
    }

    private static int peek() {
        return list.get(list.size()-1);
    }

    private static void push(int elem) {
        list.add(elem);
    }

    private static int pop() {
        if (!isEmpty()) {
           return list.remove(list.size()-1);
        }
        return -1;
    }

    private static boolean isEmpty() {
        return list.size()==0;
    }

    private static void show() {
        System.out.println("");
        if (list.size() == 0) {
            System.out.println("STACK IS EMPTY");
        } else {
            for(int i : list)
                System.out.print(i+" ");
        }
    }

}
