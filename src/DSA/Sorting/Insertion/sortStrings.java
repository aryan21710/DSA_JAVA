package DSA.Sorting.Insertion;

import java.util.Scanner;

class sortStrings {

    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }

        //Write your code here
        for (int i = 0; i < size; i++) {
            System.out.println(sortStrings.customSort(firstNames, size,"ascending")[i]);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(sortStrings.customSort(lastNames, size,"descending")[i]);
        }
    }

    static String[] customSort(String[] arr, int size, String order) {
        for (int i = 0; i < size; i++) {
            String temp="";
            for (int j = i+1; j > 0 && j < size ; j--) {
                if (order == "ascending") {
                    if (arr[j].compareTo(arr[j-1]) < 0) {
                        temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                } else if (order == "descending") {
                    if (arr[j].compareTo(arr[j-1]) > 0) {
                        temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                }
            }
        }
        return arr;
    }
}