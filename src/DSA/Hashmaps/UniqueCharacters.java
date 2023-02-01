package DSA.Hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] c = s.toCharArray();
        findFirstUniqueChar(c);
    }

    static void findFirstUniqueChar(char[] c) {
        String unique="-1";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char i: c) {
            if (!map.containsKey(i)) {
                map.put(i,1);
            } else {
                map.put(i,map.get(i)+1);
            }
        }
        Set<Map.Entry<Character,Integer>> set=map.entrySet();
        for (Map.Entry<Character,Integer> s: set) {
            if (s.getValue()==1) {
                unique=Character.toString(s.getKey());
                break;
            }
        }
        System.out.println(unique);
    }
}
