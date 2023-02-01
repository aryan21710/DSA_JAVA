package DSA.DynamicProgramming;

// Print number in fibonacci series at given index.

import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class Fibonacci {
    public static void main(String[] args) {
        int numbers = 6;
//        System.out.println(" fibnonacci at index " +numbers+ " is "+printNumberAtIndexInFibSeries(numbers));
        testFibonacciSeries();
//                System.out.println(extendedFibonacci(numbers));

    }

    static int printNumberAtIndexInFibSeries(int n) {
        if (n <= 1)
            return n;
        return printNumberAtIndexInFibSeries(n - 1) + printNumberAtIndexInFibSeries(n - 2);
    }



    static int[] printFibonacciSeries(int count) {
       int[] fib = new int[count];
       fib[0]=0;
       fib[1]=1;

        for (int i = 2; i < count; i++) {
            fib[i]=fib[i-2]+fib[i-1];
        }

        return fib;
    }

    @Test
    static void testFibonacciSeries() {
        int[] expected = {0, 1, 1, 2, 3};
        int[] actual = printFibonacciSeries(5);
        assertArrayEquals(expected, actual);
    }

}
