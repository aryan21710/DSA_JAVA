package DSA.Searching.Binary;

import java.util.Scanner;

public class countComparisonAndFailedAttempts {
    private class BinarySearch {

        public void searchArray(int[] inputArr, int key) {
            ReturnObj myObj = new ReturnObj();
            int failedAttempts=0,comparison=0, lindex = 0;
            int rindex = inputArr.length -1;
            while(lindex<=rindex) {
                int middle = (lindex+rindex)/2;
                comparison++;
                if (inputArr[middle]==key) {
                    myObj.comparison = comparison;
                    myObj.failedAttempt = failedAttempts;
                    break;
                }
                if (inputArr[middle] > key) {
                    rindex = middle-1;
                    comparison++;
                } else {
                    lindex = middle + 1;
                    comparison++;
                }
                failedAttempts++;
                myObj.comparison = comparison;
                myObj.failedAttempt = failedAttempts;
            }
            myObj.showDetails();
        }

    }
    public static void main(String[] args) {
        countComparisonAndFailedAttempts outer = new countComparisonAndFailedAttempts();
        countComparisonAndFailedAttempts.BinarySearch binary  = outer.new BinarySearch();
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int size = input.nextInt();
//        int[] myArr= new int[size];
        int[] myArr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

//        System.out.println("Enter the elements in an array");
//        for (int i = 0; i < size; i++) {
//            myArr[i] = input.nextInt();
//        }
        System.out.println("Enter the element you want to search in the array");
        int key = input.nextInt();
        binary.searchArray(myArr,key);

    }
}

class ReturnObj {
     int comparison=0;
     int failedAttempt=0;
     public void showDetails() {
         System.out.println("Comparison:- "+comparison+" failedAttempt:-"+failedAttempt);
     }
}


