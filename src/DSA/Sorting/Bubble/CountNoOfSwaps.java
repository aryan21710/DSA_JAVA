package DSA.Sorting.Bubble;

import java.util.Scanner;
class CountNoOfSwaps {
    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int var = 0;
        int totalSwaps = 0;
        //Write your code here
        for (int i = 0; i < M ; i++) {
            for (int j = 1; j < size-i; j++) {
                if (array[j-1] < array[j] ) {
                    var = array[j-1];
                    array[j-1]=array[j];
                    array[j]=var;
                    totalSwaps+=1;
                }
        }
        }
        return totalSwaps;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iterations = input.nextInt();
        int size = input.nextInt();
        int[] inputArr = new int[size];
        for (int i = 0; i < size ; i++)
            inputArr[i] = input.nextInt();

        System.out.println(CountNoOfSwaps.totalBubbleSortSwaps(inputArr, iterations));
}
}