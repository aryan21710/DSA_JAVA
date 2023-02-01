package DSA.Assignment;

import java.util.Scanner;

// https://learn.upgrad.com/course/3008/segment/28400/177645/545430/2796417
public class FindAllSymmetricPairsIn2DArray {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int arr[][] = new int[row][2];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        symmetricPair(arr);
    }

    private static void symmetricPair(int[][] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0])
                    System.out.println(arr[i][0]+" "+ arr[i][1]);
            }
        }
    }
}
