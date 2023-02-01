package DSA.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElementInAStream {
    static int thirdLargestNo=-1;
    static int thirdLargestIndex=-1;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int stream[] = new int[n];
        for (int i = 0; i < n; i++) {
            stream[i] = sc.nextInt();
        }

        for (int i = 0; i < stream.length; i++) {
            int[] newStream = createArray(stream,i);
            findKthLargestElem(newStream, k, i);
        }
    }

    private static int[] createArray(int[] stream, int i) {
        int[] newStream=new int[i+1];
        for (int j = 0; j <= i; j++) {
            newStream[j]=stream[j];
        }
        return newStream;
    }

    private static void findKthLargestElem(int[] stream, int k, int i) {
        if (i < k-1) {
            System.out.println("None");
            return;
        } else {
            Arrays.sort(stream);
            if (stream[i] > thirdLargestNo)
                thirdLargestIndex+=1;
        }
        thirdLargestNo=stream[thirdLargestIndex];
        System.out.println("3 largest number is "+ thirdLargestNo);
    }
}
