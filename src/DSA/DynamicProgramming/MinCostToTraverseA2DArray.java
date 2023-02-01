package DSA.DynamicProgramming;

// https://learn.upgrad.com/course/3008/segment/28400/177647/545439/2796470

import java.util.Scanner;

public class MinCostToTraverseA2DArray {

    private static int minCost(int cost[][], int m, int n)
    {
        int minimumCost = cost[m][n];

        while(true) {
            int i=m;
            int j=n;
            int min=Integer.MAX_VALUE;
            if (m==0 && n==0)
                break;
            if (m > 0) {
                if (cost[m-1][n] < min) {
                    min = cost[m-1][n];
                    i=m-1;
                    j=n;
                }
            }


            if (n > 0) {
                if (cost[m][n-1] < min) {
                    min = cost[m][n-1];
                    j=n-1;
                    i=m;
                }
            }

            if (m > 0 && n > 0) {
                if (cost[m-1][n-1] < min) {
                    min = cost[m-1][n-1];
                    i=m-1;
                    j=n-1;
                }
            }

            m=i;
            n=j;
            minimumCost+=min;
        }
        return minimumCost;
    }

    static int recursionApproach(int cost[][], int m, int n) {
        int i=m;
        int j=n;
        int min=Integer.MAX_VALUE;
        if (m==0 && n==0)
            return 0;

        if (m-1 >= 0 && cost[m-1][n] < min) {
            min=cost[m-1][n];
            i=m-1;
            j=n;
        }

        if (n-1 >= 0 && cost[m][n-1] < min) {
            min=cost[m][n-1];
            i=m;
            j=n-1;
        }
        if (m-1 >= 0 && n-1 >= 0 && cost[m-1][n-1]<min) {
            min=cost[m-1][n-1];
            i=m-1;
            j=n-1;
        }

        return min+recursionApproach(cost,i,j);
    }

    /* A utility function that returns minimum of 3 integers */
    private static int min(int x, int y, int z)
    {
        if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
    }

    private static int upgradeVersion(int cost[][], int m, int n)
    {
        /* Initialize 2D array to store the minimum cost to reach a particular cell */
        int i, j;
        int minCost[][]=new int[m+1][n+1];
        minCost[0][0] = cost[0][0];

        /* Initialize first column of minimum cost(table) array */
        for (i = 1; i <= m; i++)
            minCost[i][0] = minCost[i-1][0] + cost[i][0];

        /* Initialize first row of table array */
        for (j = 1; j <= n; j++)
            minCost[0][j] = minCost[0][j-1] + cost[0][j];

        /* Construct rest of the table array from the recursion relation */
        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
                minCost[i][j] = min(minCost[i-1][j-1],
                        minCost[i-1][j],
                        minCost[i][j-1]) + cost[i][j];

        /* return [m][n] element of the minimum cost array */
        return minCost[m][n];
    }





    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
        Scanner scan = new Scanner(System.in);
        int xCoordinate = scan.nextInt();
        int yCoordinate = scan.nextInt();
//        System.out.println(minCost(cost,xCoordinate,yCoordinate));
//        System.out.println(cost[xCoordinate][yCoordinate]+recursionApproach(cost,xCoordinate,yCoordinate));
        System.out.println(upgradeVersion(cost,xCoordinate,yCoordinate));


    }
}







