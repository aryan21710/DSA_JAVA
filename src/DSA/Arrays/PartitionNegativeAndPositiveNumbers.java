package DSA.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// https://learn.upgrad.com/course/3008/segment/28400/170163/520787/2673090

public class PartitionNegativeAndPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }


    static void printArray(int count, ArrayList<Integer> arr, String message) {
        if (count > 0) {
            for (int j: arr)
                System.out.print(j+" ");
            System.out.println("");
        } else {
            System.out.println(message);
        }
    }

    static HashMap<String,ArrayList<Integer>> compareNumbersUsingXor(int[] arr) {
        ArrayList<Integer>positive=new ArrayList();
        ArrayList<Integer>negative=new ArrayList();
        HashMap<String,ArrayList<Integer>>map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] ^ 0) >= 0)
                // if number xor with 0 < 0 it is a negative number otherwise it is a positive number;
                positive.add(arr[i]);
            else
                negative.add(arr[i]);
        }
        map.put("positive",positive);
        map.put("negative",negative);
        return map;
    }



    // Method to partition negative and positive numbers without comparing with 0
    static void partitionNegativeAndPositive(int n, int arr[]) {
        int firstElem = arr[0];

        HashMap<String,ArrayList<Integer>>map=compareNumbersUsingXor(arr);
        ArrayList<Integer>positive=map.get("positive");
        ArrayList<Integer>negative=map.get("negative");
        int positiveCount=positive.size();
        int negativeCount=negative.size();

        if (firstElem >= 0) {
            printArray(positiveCount, positive, "Array doesn't have positive numbers");
            printArray(negativeCount,negative,"Array doesn't have negative numbers");
        } else {
            printArray(negativeCount,negative,"Array doesn't have negative numbers");
            printArray(positiveCount, positive, "Array doesn't have positive numbers");
        }

    }
}
