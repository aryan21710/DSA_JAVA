package DSA.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Gcd {
    static int gcdByIteration(int x, int y)
    {
        int min = Math.min(x,y);
        int max = Math.max(x,y);
        ArrayList<Integer> divisibleByMin = new ArrayList<>();
        ArrayList<Integer> divisibleByMax = new ArrayList<>();

        int iterator = min%2==0 ? 2: 1;
        for(int i=iterator; i<=min;i=i+iterator) {
            if (min%i==0)
                divisibleByMin.add(i);
        }

        divisibleByMin.add(1);
        for(int i=0; i<divisibleByMin.size();i++) {
            if (max%divisibleByMin.get(i)==0)
                divisibleByMax.add(divisibleByMin.get(i));
        }

        int highestGcd = Integer.MIN_VALUE;
        for (Integer j : divisibleByMax) {
            if (j > highestGcd)
                highestGcd=j;
        }

        return highestGcd;
    }
    static int gcdByRecursion(int x, int y, int iter) {
        if (x%iter==0 && y%iter==0)
            return iter;
        return gcdByRecursion(x,y, iter-1);
    }

    public static void main(String args[])
    {
        int x, y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        if (x < y)
            System.out.println(gcdByRecursion(x, y, x) + "\n" );
        else
            System.out.println(gcdByRecursion(x, y, y) + "\n" );


//        System.out.println(gcdByIteration(x, y) + "\n" );
    }
}
