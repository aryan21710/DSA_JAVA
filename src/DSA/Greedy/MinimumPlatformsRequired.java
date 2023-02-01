package DSA.Greedy;

// https://learn.upgrad.com/course/3008/segment/28400/177642/545425/2796380

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class MinimumPlatformsRequired
{
    static int findPlatform(int arr[], int dep[], int n)
    {
        //Write code here
        ArrayList<Integer> platform = new ArrayList<>();
        platform.add(dep[0]);
        int currentTrain=-1;
        for (int i = 0; i < arr.length-1; i++) {
            boolean addedToPlatforms = false;
            for (int j = 0; j < platform.size(); j++) {
                if (arr[i+1] > platform.get(j)) {
                    platform.remove(platform.get(j));
                    platform.add(dep[i+1]);
                    currentTrain=dep[i+1];
                    addedToPlatforms=true;
                    break;
                }
            }
            if (!addedToPlatforms) {
                if (arr[i+1] < currentTrain) {
                    platform.add(dep[i+1]);
                }
            }
        }
        return platform.size();
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        int dep[] = new int[n];
        for(int i = 0; i < n; i++)
            dep[i] = s.nextInt();

        System.out.println(findPlatform(arr, dep, n) + "\n" );
    }
}

