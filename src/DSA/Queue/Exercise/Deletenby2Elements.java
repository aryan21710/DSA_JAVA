package DSA.Queue.Exercise;

import java.util.*;

public class Deletenby2Elements {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n > 0) {
            queue.add(s.nextInt());
            n--;
        }
        deleteSecondHalf(queue);
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        // Write your code here
        int half = (int) Math.floor((double) queue.size() / 2);
        int iteration = 0;
        while (iteration < queue.size() - half) {
            queue.add(queue.remove());
            iteration++;
        }

        iteration = 0;
        while (iteration < half) {
            queue.remove();
            iteration++;
        }
        int[] arr=new int[queue.size()];

        int size= queue.size();

        for (int i = 0; i < size; i++) {
            arr[i]=queue.remove();
        }

        System.out.println(Arrays.toString(arr));

    }


}
