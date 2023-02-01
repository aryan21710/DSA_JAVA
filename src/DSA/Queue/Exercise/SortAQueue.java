package DSA.Queue.Exercise;
import java.util.*;

public class SortAQueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
    }

    // Method to sort the queue
    static void sort(Queue<Integer> queue) {
        // Write your code here
        int lowest = -1;
        int size = queue.size();
        int[] arr=new int [size];
        for (int i = 0; i < size; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < size; j++) {
                if (i > 0 && queue.peek()==lowest)
                    queue.remove();
                else {
                    if (queue.peek() < min)
                        min = queue.peek();
                    queue.add(queue.remove());
                }
            }
            if (queue.size()==1)
                arr[i]=queue.remove();
            else {
                lowest = min;
                arr[i]=lowest;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
