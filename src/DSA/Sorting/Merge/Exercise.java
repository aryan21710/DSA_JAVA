package DSA.Sorting.Merge;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array

        //Complete this function
        int middle = (last - first)/2;
        int[] a = new int[middle+1];
        int[] b = new int[last-middle];
        int i=0,j=0;
        while(i < a.length) {
            a[i] = numbers[i];
            i++;
        }
        while(j < b.length) {
            b[j] = numbers[i];
            i++;
            j++;
        }

        for (i = 0; i < a.length; i++) {
            int temp = 0;
            for (j = 1; j < a.length - i; j++) {
                if (a[j - 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

        for (i = 0; i < b.length; i++) {
            int temp = 0;
            for ( j = 1; j < b.length - i; j++) {
                if (b[j - 1] < b[j]) {
                    temp = b[j];
                    b[j] = b[j - 1];
                    b[j - 1] = temp;
                }
            }
        }

        int k=0;
        i = 0; j = 0;
        int[] c = new int[numbers.length];
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < a.length) {
            c[k] = a[i];
            k++;
            i++;
        }

        while(j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }



    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
