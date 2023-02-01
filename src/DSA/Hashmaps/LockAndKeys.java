package DSA.Hashmaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LockAndKeys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the number of keys
        int n = in.nextInt();

        char keys[] = new char[n];
        char locks[] = new char[n];

        // store all the keys to the array "keys"
        for (int i = 0; i < n; i++) {
            keys[i] = in.next(".").charAt(0);
        }
        in.nextLine();

        //store all the locks to the array "locks"
        for (int i = 0; i < n; i++) {
            locks[i] = in.next(".").charAt(0);
        }
        printLocksAndKeys(keys, locks);

    }

    static void printLocksAndKeys(char[] keys, char[] locks) {
        Map<Character,Character> map = new LinkedHashMap<Character,Character>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i],locks[i]);
        }
        for (Character c: map.keySet()) {
            if (!map.containsValue(c)) {
                System.out.println("Not possible");
                return;
            }
        }

        for (Character c: map.keySet())
                System.out.println(c+" "+c);
    }
}
