package DSA.Assignment;

import java.util.PriorityQueue;
import java.util.Scanner;

// https://learn.upgrad.com/course/3008/segment/28400/177645/545430/2796414

public class SortNearlySortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sortArray(arr, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sortArray(int[] arr, int k) {
        // create a min heap
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // add the first k+1 elements to the heap
        for (int i = 0; i <= k; i++) {
            heap.add(arr[i]);
        }

        // do the following n-k-1 times
        for (int i = k + 1, j = 0; i < arr.length; i++, j++) {
            // remove the smallest element from the heap and put it in the correct position in the array
            arr[j] = heap.poll();
            // add the next element to the heap
            heap.add(arr[i]);
        }

        // remove the remaining elements from the heap and put them in the correct positions in the array
        for (int i = arr.length - k - 1; i < arr.length; i++) {
            arr[i] = heap.poll();
        }
    }
}

