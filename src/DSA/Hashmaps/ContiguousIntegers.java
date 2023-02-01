package DSA.Hashmaps;

import java.util.HashSet;
import java.util.Set;

public class ContiguousIntegers {
    public static void main(String[] args) {
        int[] a1 = {4, 5, 8, 9, 7, 6, 7, 3, 3};
        int[] a2 = {4, 8, 9, 7, 6, 7, 3, 3};
        int [] a3= {5,8,4,4,7,6,2,6,7,3};
        int [] a4= {1,2,7,4,5};
        int[][] input={a1,a2,a3,a4};
        int size = input.length-1;

        while( size >= 0 ) {
            System.out.println(checkForContiguousIntegers(input[size]));
            size--;
        }

    }


    static boolean checkForContiguousIntegers(int[] a) {
        Set<Integer> s = new HashSet<Integer>();
        for (int i: a)
            s.add(i);
        Object[] b= s.toArray();
        int currentElement = (int) b[0];
        int lessThanFirst = 0, greaterThanFirst=0;

        while(s.contains(currentElement)) {
            lessThanFirst++;
            currentElement--;
        }

        currentElement = (int) b[0] +1;

        while(s.contains(currentElement)) {
            greaterThanFirst++;
            currentElement++;
        }

        return lessThanFirst+greaterThanFirst == s.size() ? true: false;
    }

}
