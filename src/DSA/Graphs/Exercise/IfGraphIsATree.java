package DSA.Graphs.Exercise;


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class IfGraphIsATree {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc= new Scanner(System.in);
        int n= 10;
        if(sc.hasNextInt()){
            n=sc.nextInt();
        }
        int degree[]=new int[n];
        for(int i=0;i<n;i++){
            if(sc.hasNextInt()){
                degree[i]=sc.nextInt();
            }
        }

        if (check(degree, n))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    static boolean check(int[] degree, int n) {
        int sum=0;
        for (Integer d: degree)
            sum+=d;
        return sum==2*(n-1) ? true : false;
    }
}
