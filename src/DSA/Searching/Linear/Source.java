package DSA.Searching.Linear;

import java.util.Scanner;

class Source {

    public static void main(String[] args) {
        Source myObj = new Source();
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] myArr= new int[size];

        for (int i = 0; i < size; i++) {
            myArr[i] = input.nextInt();
        }
        int key = input.nextInt();
        System.out.println(myObj.getLinearSearchUnsuccessfulComparisonCount(myArr,key));
    }
    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int failedAttempts=0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] != key) failedAttempts++;
        }

        return failedAttempts;
    }
}


