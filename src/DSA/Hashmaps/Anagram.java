package DSA.Hashmaps;

import java.util.*;
public class Anagram{
    //Method to check if two strings are anagram of each other or not
    static int count=0;
    public static boolean check(String str1, String str2){
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        //Write your code here
        if (str1.length() != str2.length()) return false;

        if (arrange(str1.toCharArray()).equals(arrange(str2.toCharArray()))) {
            System.out.println(str1+":"+str2);
            count++;
        }

        return true;
    }
    //Method to sort the character array
    public static String arrange(char[] ch){
        //Write your code here
        for (int i = 0; i < ch.length; i++) {
            char temp=' ';
            for (int j = 1; j < ch.length-i; j++) {
                if (ch[j] < ch[j-1]) {
                    temp = ch[j];
                    ch[j] = ch[j-1];
                    ch[j-1] = temp;
                }
            }
        }
        return new String(ch);
    }

    public static void main(String[] x){
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
        }

        for(String k: map.keySet())
            check(k, map.get(k));

        if (count == 0)
        System.out.println(false);
    }



}
