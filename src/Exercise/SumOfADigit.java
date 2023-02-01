package Exercise;

import java.util.Scanner;

public class SumOfADigit {
    static int sumOfDigitsSingle(int n)
    {
        //Write code here
        int remainder=0;
        int sum=0;
        while(n > 0) {
            remainder+=n%10;
            n=n/10;
        }
        if (remainder > 0) {
            sum+=remainder%10;
            remainder=remainder/10;
            return sum+remainder;
        }

        return remainder;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println(sumOfDigitsSingle(n) + "\n" );
    }
}
