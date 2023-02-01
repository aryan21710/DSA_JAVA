package DSA.Hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairWithGivenSum {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();

        Scanner in = new Scanner(System.in);

        // number of the elements
        int n = in.nextInt();

        int array[] = new int[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }

        // getting the target sum from input
        int targetSum = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i],i);
        }
        boolean status = false;

        for (Integer i: map.keySet()) {
            if (map.containsKey(targetSum-i)) {
                status = true;
                break;
            }
        }
        System.out.println(status);
    }
}
