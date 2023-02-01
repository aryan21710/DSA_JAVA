package DSA.Hashmaps;



import java.util.*;

public class Exercise{
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){
        //Write your code here
        Set<String> distinct = new HashSet<>();
       for (Integer i: map.keySet())
           distinct.add(map.get(i));


       for (String s: distinct)
           System.out.print(s+" ");
    }

    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}
