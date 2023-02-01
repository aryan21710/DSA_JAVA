package DSA.Assignment;

import java.util.*;

// https://learn.upgrad.com/course/3008/segment/28400/177645/545430/2796419

public class CommonElemInAllRowsOfMatrix {

    public static void printElementInAllRows(int mat[][]) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            Set<Integer> set=new HashSet<>();
            for (int j = 0; j < mat[0].length; j++) {
                int elem = mat[i][j];
                set.add(elem);
            }
            for (Integer s: set) {
                if (map.containsKey(s))
                    map.put(s,map.get(s)+1);
                else
                    map.put(s,1);
            }
        }


        for (Integer key: map.keySet())
            if (map.get(key) == mat.length)
                list.add(key);

        Collections.sort(list);
        for (Integer j: list)
            System.out.print(j+" ");
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printElementInAllRows(matrix);
    }
}