package Exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class SumClosestToZero {
    static void sumClosestToZero(int arr[], int n)
    {
        //Write code here
        LinkedHashMap<Integer,String> map =new LinkedHashMap<>();
        int left=0, right=n-1;
        Arrays.sort(arr);
        while(left < right) {
            int sum = Math.abs(arr[left]+arr[right]);
            String value = arr[left]+" "+arr[right];
            if (arr[left]+arr[right] > 0)
                right--;
            else
                left++;
            map.put(sum,value);
        }
        int min=Integer.MAX_VALUE;
        for (Integer i: map.keySet()) {
             if (i < min)
                 min = i;
         }

        System.out.println(map.get(min));
    }

    public static void main (String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        sumClosestToZero(arr, n);
    }
}
