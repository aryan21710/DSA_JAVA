package DSA.Queue.LinkedListBasedQ;

import java.util.LinkedList;

public class Source {
    private static LinkedList<Integer> list=new LinkedList<>();
    public static void main(String[] args) {
        Source myQueue = new Source();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.show();
        int topElem=myQueue.dequeue();
        System.out.println("element popped "+topElem);
        topElem=myQueue.dequeue();
        System.out.println("element popped "+topElem);
        myQueue.show();
        myQueue.enqueue(50);
        myQueue.show();

    }

    private static boolean isEmpty() {
        return list.size()==0;
    }

    private static void enqueue(int elem) {
        list.add(elem);
    }

    private static int dequeue() {
          if (!isEmpty()) {
              return list.remove(0);
          }
          return -1;
    }

    private static void show() {
        if (list.size() > 0) {
            for (int i: list)
                System.out.print(i+" ");
            System.out.println("");
        }
    }
}
