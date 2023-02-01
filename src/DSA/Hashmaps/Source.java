package DSA.Hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Source {
    public static void main(String[] args) {
        Map<String,int[]> map = new HashMap<>();
        int[][] a={{1, 2}, {2, 3}, {3, 4}, {4, 3}, {2, 1}};


        for (int i = 0; i < a.length; i++) {
            String sum="";
            for (int j = 0; j < a[i].length; j++) {
                sum+=Integer.toString(a[i][j]);
            }
            map.put(sum,a[i]);
        }




        Set<Map.Entry<String,int[]>> set=map.entrySet();
        for (Map.Entry<String,int[]> s: set) {
            System.out.println(s.getKey()+" : "+Arrays.toString(s.getValue()));
        }


    }
}
