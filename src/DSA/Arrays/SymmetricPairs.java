

package DSA.Arrays;


import java.util.Arrays;

public class SymmetricPairs {
    public static void main(String[] args) {
        int[][] a={{1, 2}, {2, 3}, {3, 4}, {4, 3}, {2, 1}};

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i][0]==a[j][1] && a[i][1]==a[j][0])
                    System.out.println(Arrays.toString(a[i]));
            }
        }

    }
}

