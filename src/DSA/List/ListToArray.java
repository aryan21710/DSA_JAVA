package DSA.List;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aryan");
        list.add("ryan");
        list.add("seema");
        list.add("kabir");

        // Approach 2:-  ListToArray.toArray(list);
        // Approach 1:- following
        for (Object o: list.toArray())
        System.out.println("Printing Array: "+o.toString());

    }

    private static void toArray(List<String> list) {
        String[] output= new String[list.size()];
        for (int l = 0; l < list.size(); l++)
            output[l] = list.get(l);


        System.out.print("Array :- ");
        for (String o: output)
            System.out.print(o+" ");

    }
}



