package Exercise;

// https://learn.upgrad.com/course/3008/segment/28401/168987/517365/2656708

import java.util.Scanner;

public class ProdOfRemainingElements {
    static void RPRE(int arr[], int n)
    {
        //Write code here
        if (n==1) {
            System.out.print(0);
            return;
        }

        int[] prodLtr=new int[n];
        int[] prodRtl=new int[n];
        prodLtr[0]=1;
        prodRtl[n-1]=1;
        for (int i = 1; i < n; i++)
            prodLtr[i]=prodLtr[i-1]*arr[i-1];

        for (int j = n-1; j > 0; j--)
            prodRtl[j-1]=prodRtl[j]*arr[j];

        for (int i = 0; i < prodRtl.length; i++) {
            System.out.print(prodRtl[i]*prodLtr[i]+" ");
        }
    }

    static void RPRE2(int arr[], int n)
    {
        if (n == 1)
        {
            System.out.print("0");
            return;
        }

        int i, temp = 1;

        int product[] = new int[n];

        for (int j = 0; j < n; j++)
            product[j] = 1;

        for (i = 0; i < n; i++)
        {
            product[i] = temp;
            temp *= arr[i];
        }

        temp = 1;

        for (i = n - 1; i >= 0; i--)
        {
            product[i] *= temp;
            temp *= arr[i];
        }

        for (i = 0; i < n; i++)
            System.out.print(product[i] + " ");

        return;
    }


    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        RPRE(arr, n);
    }

}



