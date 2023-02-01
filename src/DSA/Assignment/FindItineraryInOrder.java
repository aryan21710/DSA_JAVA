package DSA.Assignment;

import java.util.*;

public class FindItineraryInOrder {
    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            tickets.put(sc.next(),sc.next());
        }
        findItinerary(tickets);
    }



    private static void findItinerary(Map<String, String> tickets) {
        String source="";
        for (String city: tickets.keySet()) {
            if (!tickets.containsValue(city))
                source=city;
        }

        for (String city: tickets.keySet()) {
            if (tickets.containsKey(source)) {
                System.out.println(source+"->"+tickets.get(source));
                source=tickets.get(source);
            }
        }
    }
}
