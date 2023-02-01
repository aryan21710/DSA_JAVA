package Leetcode.Level1;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s="badc";
        String t="babc";
        System.out.println(isIsomorphic(s,t));
    }
    static public  boolean isIsomorphic(String s, String t) {
        int[] sChars = new int[256];
        int[] tChars = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sChars[sChar] != tChars[tChar]) {
                return false;
            }
            sChars[sChar] = i + 1;
            tChars[tChar] = i + 1;
        }
        return true;
    }
}
