package Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SumOfAnyPairIsANumber {
    public static void main(String[] args) {
        int[] input = {3,3};
        int element=6;
//        findIndexOfPairsWithSumEqualToElement1(input,element);
        findIndexOfPairsWithSumEqualToElement2(input,element);
    }

    private static void findIndexOfPairsWithSumEqualToElement1(int[] input, int element) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if (input[i]+input[j]==element)
                    System.out.println(i+" "+j);
            }
        }
    }

    private static int[] findIndexOfPairsWithSumEqualToElement2(int[] input, int element) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            map.put(input[i],i);
        }

        for (int i = 0; i < input.length; i++) {
             int diff = element-input[i];
             if (map.containsKey(diff) && map.get(diff)!=i) {
                 return new int[] {i,map.get(diff)};
             }
        }

        return null;


    }
}
