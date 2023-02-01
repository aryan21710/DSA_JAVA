package DSA.Queue.Exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Print5thElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();
        int noOfElements = in.nextInt();
        for (int i = 0; i < noOfElements; i++) {
            queue.add(in.nextInt());
        }
        find5thElementFromTail(queue);
    }

    static void find5thElementFromHead(Queue<Integer> queue) {
        if (queue.size() < 5) {
            System.out.println("There are not enough elements in the queue");
            return;
        }
        int count=0;
        while(!queue.isEmpty()) {
            int elem=queue.remove();
            count++;
            if (count==5) {
                System.out.println(elem);
                return;

            }
        }
    }

    static void find5thElementFromTail(Queue<Integer> queue) {
        if (queue.size() < 5) {
            System.out.println("There are not enough elements in the queue");
            return;
        }
        int size=queue.size();
        int count=0;
        while(!queue.isEmpty()) {
            int elem=queue.remove();
            count++;
            if (count==size+1-5) {
                System.out.println(elem);
                return;
            }
        }

    }
}
