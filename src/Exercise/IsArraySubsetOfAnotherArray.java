package Exercise;

import java.util.HashMap;

public class IsArraySubsetOfAnotherArray {
    public static void main(String[] args) {
        int[] arr1={1,5,9,0,4,6};
        int[] arr2 ={6,9,0};
        System.out.println(checkForSubset(arr1, arr2));
    }

    private static boolean checkForSubset(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map1= new HashMap<>();
        for (int i: arr1) {
            if (map1.containsKey(i))
                map1.put(i, map1.get(i)+1);
            else
                map1.put(i,1);
        }

        for (int i: arr2) {
            if (!map1.containsKey(i))
                return false;
            map1.put(i,map1.get(i)-1);
        }

        for (int i: arr2) {
            if (map1.get(i)>0 || map1.get(i)<0)
                return false;
        }

        return true;
    }
}
