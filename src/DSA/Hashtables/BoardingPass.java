package DSA.Hashtables;

import java.util.*;
import java.util.Scanner;

class BoardingPass {
    public static void main(String[] args)
    {
        Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }


        for(int i:arr) {
            if (boardingPass.containsKey(i)) {
                System.out.println(i);
                boardingPass.put(i, "Duplicate");
                break;
            } else {
                boardingPass.put(i, "Checked");
            }
        }

    }
}

