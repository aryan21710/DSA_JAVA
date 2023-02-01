package DSA.Assignment;

// https://learn.upgrad.com/course/3008/segment/28400/177645/545430/2796415

import java.util.Arrays;
import java.util.Scanner;

public class SumBetweenPthAndQthSmallestElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(sumBetweenPthToQthSmallestElement(arr, p, q));
    }

    private static int sumBetweenPthToQthSmallestElement(int[] arr, int p, int q) {
        int answer=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i < q-1 && i > p-1)
                answer+=arr[i];
        }
        return answer;
    }
}
