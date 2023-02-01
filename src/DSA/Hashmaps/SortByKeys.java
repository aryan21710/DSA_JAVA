package DSA.Hashmaps;

// Java Code to sort Map by key value
import java.util.*;
public class SortByKeys {

    // This map stores unsorted values
    static Map<Integer, Integer> map = new HashMap<>();

    // Function to sort map by Key
    public static void sortbykey()
    {

        ArrayList<Integer> sortedKeys
                = new ArrayList<Integer>(map.keySet());

        Collections.sort(sortedKeys);

        // Display the TreeMap which is naturally sorted
        for (Integer x : sortedKeys)
            System.out.println("Key = " + x
                    + ", Value = " + map.get(x));
    }

    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        map.put(1,2);
        map.put(6,8);
        map.put(1,8);
        map.put(5,7);
        map.put(3,4);

        // Calling the function to sortbyKey
        sortbykey();
    }
}

