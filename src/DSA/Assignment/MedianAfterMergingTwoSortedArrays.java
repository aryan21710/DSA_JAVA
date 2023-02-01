package DSA.Assignment;


import java.util.*;

public class MedianAfterMergingTwoSortedArrays {

    public static int median(int[] arr1, int[] arr2 , int n){
        int[] combinedArr=new int[n*2];
        for (int i = 0; i < arr1.length; i++) {
            combinedArr[i]=arr1[i];
        }

        for (int j = 0, k=n; j < arr2.length; j++) {
            combinedArr[k]=arr2[j];
            k++;
        }

        Arrays.sort(combinedArr);
        return (combinedArr[n-1]+combinedArr[n])/2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(median(arr1, arr2, n));
    }
}
