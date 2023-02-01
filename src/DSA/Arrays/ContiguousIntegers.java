package DSA.Arrays;

import java.util.Arrays;

public class ContiguousIntegers {
    public static void main(String[] args) {
        int[] a1 = {4, 5, 8, 9, 7, 6, 7, 3, 3};
        int[] a2 = {4, 8, 9, 7, 6, 7, 3, 3};
        System.out.println(checkForContiguousIntegers(a1));
    }

    static String removeDuplicates(int[] a1) {
        String output="";
        for (int i = 0; i < a1.length; i++) {
            String elem = Integer.toString(a1[i]);
            if (!output.contains(elem)) {
                if (i==a1.length-1) {
                    output+= elem;
                } else {
                    output+= elem+",";
                }
            }
        }
        return output;
    }

    static int[] strToSortedArr(String output) {
        String[] splitArray = output.split(",");
        int[] a= new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            a[i] = Integer.parseInt(splitArray[i]);
        }
        Arrays.sort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+" ");
//        }
//        System.out.println("");
        return a;
    }

    static boolean checkForContiguousIntegers(int[] a1) {
        String distinctStr= removeDuplicates(a1);
        int[] sortedArr= strToSortedArr(distinctStr);
        for (int i = 0; i < sortedArr.length-1; i++) {
            if (sortedArr[i+1]-sortedArr[i]!=1)
                return false;
        }
        return true;

    }
}
