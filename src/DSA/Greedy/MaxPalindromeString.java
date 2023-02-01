package DSA.Greedy;

import java.util.HashMap;
import java.util.Scanner;

public class MaxPalindromeString {
    static int findMaxLengthOfPalindrome(String partialPalindrome) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength=0;
        for (Character c: partialPalindrome.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.getOrDefault(c,0)+1);
        }

        for (Character c: map.keySet()) {
            if (map.get(c) >= 2) {
                maxLength+=(map.get(c)/2)*2;
            }
        }

        if (maxLength==0)
            return 1;

        if (maxLength < partialPalindrome.length())
            return ++maxLength;

        return maxLength;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partialPalindrome = in.nextLine();
        System.out.println(findMaxLengthOfPalindrome(partialPalindrome));
    }
}
