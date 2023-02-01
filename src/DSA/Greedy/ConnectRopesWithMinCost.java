package DSA.Greedy;
// https://learn.upgrad.com/course/3008/segment/28400/177642/545425/2796380

import java.util.Arrays;
import java.util.Scanner;

public class ConnectRopesWithMinCost {
    static int minCost(int arr[], int n)
    {
        //Write code here
        Arrays.sort(arr);
        int sum = arr[0];
        int[] sumOfAdjacentNumbers=new int [n-1];
        for (int j = 1; j < n; j++) {
            sum+=arr[j];
            sumOfAdjacentNumbers[j-1]=sum;
        }
        sum=0;
        for (int i = 0; i < sumOfAdjacentNumbers.length; i++) {
            sum+=sumOfAdjacentNumbers[i];
        }

        return sum;
    }
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(minCost(arr, n) + "\n" );
    }
}
