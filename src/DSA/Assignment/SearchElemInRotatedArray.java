package DSA.Assignment;
import java.util.*;

public class SearchElemInRotatedArray {

    public static int search(int arr[], int left, int right, int key) {
        // Write code here
        int answer = -1;
        while(left<=right) {
            int median = (left+right)/2;
            if (key==arr[median]) {
                answer=median;
                break;
            }
            if (key < arr[median]) {
                if (key < arr[left])
                    left=median+1;
                else
                    right=median-1;
            } else {
                left=median+1;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int i = search(arr, 0, n - 1, key);
        if (i != -1) {
            System.out.println(i);
        } else {
            System.out.println("-1");
        }
    }
}
