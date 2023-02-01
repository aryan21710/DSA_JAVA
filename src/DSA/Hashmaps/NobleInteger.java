package DSA.Hashmaps;

// https://learn.upgrad.com/course/3008/segment/28401/168987/517365/2656703

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class NobleInteger {
    static int duplicate(int[] arr, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]))
                return i;
            map.put(arr[i],i);
        }
        return -1;
    }

    static int nobleNum(int arr[], int n)
    {
        Arrays.sort(arr);
        int dupElem= duplicate(arr,n);
        int nobleInt = -1;
        for (int i = 0; i < n; i++) {
            int length = n-1-i;
            if (arr[i] == length) {
                nobleInt=arr[i];
                break;
            }
        }
        if (dupElem != nobleInt)
            return 1;
        return -1;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(nobleNum(arr, n) + "\n" );
    }
}
