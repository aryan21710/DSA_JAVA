package Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FindTheMostCommonName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfNames = in.nextInt();
        String[] names= new String[noOfNames];
        for (int i = 0; i < noOfNames; i++) {
            names[i] = in.next();
        }

        System.out.println(findMostCommonName(names));
    }

    private static String findMostCommonName(String[] names) {
        String commonName="";
        LinkedHashMap<String,Integer> map= new LinkedHashMap<>();
        for (String name: names) {
            if (map.containsKey(name))
                map.put(name, map.get(name)+1);
            else
                map.put(name,1);
        }
        int max=Integer.MIN_VALUE;
        for (String key: map.keySet()) {
            if (map.get(key) > max) {
                max= map.get(key);
                commonName=key;
            }

        }
        return commonName;

    }
}
