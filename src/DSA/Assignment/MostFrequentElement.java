package DSA.Assignment;

// https://learn.upgrad.com/course/3008/segment/28400/177645/545430/2796402

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MostFrequentElement {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mostFrequentElement(arr));
    }

    static int mostFrequentElement(int[] arr) {
        if (arr.length==0)
            return -1;
        int max= Integer.MIN_VALUE;
        int output=-1;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j])
                    count++;
            }
            if (!map.containsKey(arr[i]))
                map.put(arr[i],count);
        }
        for (Integer i: map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
                output = i;
            }
        }
        return output;
    }
}
