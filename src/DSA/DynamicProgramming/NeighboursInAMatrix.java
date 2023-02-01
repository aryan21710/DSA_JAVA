package DSA.DynamicProgramming;


//https://learn.upgrad.com/course/3008/segment/28400/177647/545439/2796460


public class NeighboursInAMatrix
{
    public static void main(String args[])
    {

        int matrix[][];
        matrix = new int[4][4];

        int i,j;

        /* Updating first column */
        for (i = 0; i < matrix.length; i++) {
            matrix[i][0] = i;
        }

        /* Updating first row */
        for (j=0; j< matrix[0].length; j++) {
            matrix[0][j] = j;
        }

      	/* Write your loop here to update the above matrix such that
      	each cell is max of its neighbouring cell.
      	Store your results in the matrix itself*/

        for (int k = 0; k < matrix.length; k++) {
            int max;
            for (int l = 0; l < matrix[k].length; l++) {
                if (k!=0 && l!=0) {
                    if (matrix[k][l-1] > matrix[k-1][l])
                        max = matrix[k][l-1];
                    else
                        max = matrix[k-1][l];
                    matrix[k][l] = max;
                }
            }
        }

        /* Printing 2D matrix. Don't change the code below*/
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j]);
            System.out.print('\n');
        }
    }
}

