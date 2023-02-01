package DSA.Hashmaps;
// https://learn.upgrad.com/course/3008/segment/28401/168987/517365/2656702

// Using TC of O(n);

import java.util.HashMap;
import java.util.Scanner;

public class DupElemInArray {
    public static void main(String[] args) {
        DupElemInArray myArr = new DupElemInArray();
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(myArr.duplicate(arr, n));
    }

    public int duplicate(int[] arr, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]))
                return arr[i];
            else {
                map.put(arr[i],i);
            }
        }
        return -1;
    }
}
