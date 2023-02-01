package DSA.DynamicProgramming;
import java.util.Scanner;

public class MaxWaysToPayAmount {
        public static int count(int[] d, int amount) {

            int[][] V = new int[amount + 1][d.length];

            /* Write down the base solution*/
            /* Fill in the rest of the matrix using recursion relation */

            return V[amount][d.length-1];
        }

        public static void main(String args[]) {
            int[] d = {1,5,7,10};
            Scanner scan = new Scanner(System.in);
            int amount = scan.nextInt();
            System.out.println(count(d, amount));
            scan.close();
        }

}
