package DSA.Greedy;

import java.util.Arrays;
import java.util.Scanner;

// https://learn.upgrad.com/course/3008/segment/28400/177642/545423/2796362
public class MinimumAbsDiffBetweenTwoElemInArr {
    static int mad(int arr[],int n)
    {
        /* This function returns minimum absolute difference between
           any two elements present in arr[] of size n */
        int sum=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i-1]-arr[i] < sum)
                sum = Math.abs(arr[i-1]-arr[i]);
        }
        return sum;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = Math.abs(s.nextInt());
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();


      System.out.println(mad( arr, n ) + "\n" );
    }
}
