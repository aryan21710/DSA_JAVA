package DSA.Hashmaps;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintItinerary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the no of tickets from input
        int n = in.nextInt();

        // map to store all the tickets
        Map<String, String> tickets = new HashMap<String, String>();

        // Store the source and destination of the tickets to the map "tickets"
        while(n > 0) {
            String k = in.next();
            String v = in.next();
            if (tickets.containsKey(k)) {
                int compare= tickets.get(k).compareTo(v);
                if (compare > 0) {
                    tickets.put(k,tickets.get(k));
                } else {
                    tickets.put(k,v);
                }
            } else {
                tickets.put(k,v);
            }
            n--;
        }

        printItinerary(tickets);

    }

    static void printItinerary(Map<String,String> map) {
        List<String> arr = new ArrayList<>();
        String source="";

        for (String s: map.keySet()) {
            if (!map.containsValue(s)) {
                source=s;
                arr.add(s);
                arr.add(map.get(source));
            }
        }

        if (source=="") {
            System.out.println("Invalid");
            return;
        }

        int size=map.size();
        while(size > 0) {
            source = map.get(source);
            if (map.containsKey(source)) {
                arr.add(map.get(source));
            } else {
                break;
            }
            size--;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (i== arr.size()-1) {
                System.out.print(arr.get(i));
            } else {
                System.out.print(arr.get(i)+" ");
            }
        }
    }
}