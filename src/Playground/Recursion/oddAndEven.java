package Playground.Recursion;

public class oddAndEven {
    public static void main(String[] args) {
//        printSeries(1);
        System.out.println(printNumbers(4));

    }

    private static void printSeries(int n) {
        if (n==10) return;
        if (n%2==0)
            System.out.print(n-1+" ");
        else
            System.out.print(n+1+" ");
        printSeries(n+1);
    }

    private static int printNumbers(int n) {
        if (n==1) {
            System.out.print(1);
            return 1;
        }
         System.out.print(n+" ");
         return printNumbers(n-1);
    }
}
