package DSA.Hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SymmetricPairs {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        if (arr.length>0) {
            checkSymmetricPair(arr);
        }
    }

    static void checkSymmetricPair(int[][] a) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            int firstElem = a[i][0];
            int secondElem = a[i][1];
            if (map.containsKey(secondElem) && map.get(secondElem)==firstElem) {
                System.out.println(secondElem+" "+firstElem);
                map.remove(secondElem);
            } else {
                map.put(firstElem, secondElem);
            }
        }
        if (map.size() == a.length)
            System.out.println("No Symmetric pair");
    }
}
