package DSA.Searching.Binary;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = {1,2,3,4,5,6,7,8};
        System.out.println("Enter the element you want to search in the array");
        int searchElem = input.nextInt();
        BinarySearch myObj = new BinarySearch();
        int lIndex = 0;
        int rIndex = myArr.length - 1;
//        System.out.println(myObj.binarySearchWithoutRecursion(myArr, searchElem, lIndex, rIndex));
        System.out.println("FOLLOWING OUTPUT IS RETURNED WHEN BINARY SEARCH IS DONE WITH RECURSION");
        System.out.println(myObj.binarySearchWithoutRecursion(myArr, searchElem, lIndex, rIndex));
//        System.out.println("Length of array"+BinarySearch.findArrLength(myArr));

    }

    public int binarySearchWithoutRecursion(int[] myArr, int searchElem, int lIndex, int rIndex) {
        int findIndex=-1;
        int comp=0;
        while (lIndex <= rIndex) {
            int middleIndex = (lIndex + rIndex) / 2;
            if (myArr[middleIndex] > searchElem) {
                rIndex = middleIndex - 1;
                comp++;
            } else if (myArr[middleIndex] < searchElem) {
                lIndex = middleIndex + 1;
                comp++;
            } else {
                findIndex = middleIndex;
                comp++;
                break;
            }
        }
        System.out.println("comp"+comp);
       return findIndex;
    }

    public int binarySearchWithRecursion(int[] myArr, int searchElem, int lIndex, int rIndex) {
            int middleIndex = (lIndex + rIndex) / 2;
            if (myArr[middleIndex] > searchElem) {
                binarySearchWithRecursion(myArr, searchElem, lIndex, middleIndex - 1);
            } else if (myArr[middleIndex] < searchElem) {
                binarySearchWithRecursion(myArr, searchElem, middleIndex + 1, rIndex);
            } else {
                System.out.println("FOUND"+middleIndex +"AT INDEX"+ middleIndex);
                return middleIndex;
            }
            return -1;
    }


    private static int findArrLength(int[] myArr) {
        int i=0;
        try {
            while(myArr[i] > -32768)
                    i++;
        } catch(Exception e) {
            System.out.println(e);
        }
        return i;
    }
}
