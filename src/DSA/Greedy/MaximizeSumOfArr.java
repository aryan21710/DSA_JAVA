package DSA.Greedy;

// https://learn.upgrad.com/course/3008/segment/28400/177642/545423/2796360

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeSumOfArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int elements = in.nextInt();
        int[] arr = new int[elements];
        for (int i = 0; i < elements; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("SUM OF THE ARRAY IS:-  "+findMaxSumOfArr(arr));

    }

    static int findMaxSumOfArr(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=i*arr[i];
        }
        return sum;
    }
}
