package Playground.Exercise;

import java.util.Set;
import java.util.TreeSet;

public class DuplicatesAndSortAnArray {
    public static void main(String[] args) {
        int[] arr = {8,2,8,9,3,4,6,7,1};
        dupAndSortTheArray(arr);
    }

    public static Integer[] dupAndSortTheArray(int[] arr) {
        Set<Integer> s = new TreeSet<>();
        for (int i : arr)
            s.add(i);

        Integer[] newArray = s.toArray(new Integer[s.size()]);

        for(int i: newArray)
            System.out.print(i+" ");
        return newArray;
    }
}
