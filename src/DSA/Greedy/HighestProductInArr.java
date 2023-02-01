package DSA.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class HighestProductInArr {

        static int highestProduct(int arr[],int n)
        {
         /* Complete this function such that it returns the highest
            product possible by multiplying any three numbers present
            in arr[] of size n */
            Arrays.sort(arr);
            int product=Integer.MIN_VALUE;
            System.out.println(product);
            for (int i = 0; i < n; i++) {
                if (i >= n-3)
                   product*=arr[i];
            }
            return product;
        }

        public static void main(String args[])
        {
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = s.nextInt();

            System.out.println(highestProduct( arr, n ) + "\n" );
        }


        static int highestProductLessTimeComplexity(int arr[], int n) {
            return -1;
        }
}
