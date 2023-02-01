package DSA.Stacks;

import java.util.Stack;

public class Palidrome {
    static Stack<Character> S = new Stack();
    public static void main(String[] args) {
        System.out.println(ifPalindrome("malyaylam"));
    }
    
    static boolean ifPalindrome(String s) {
        String output = "";
        for (Character c: s.toCharArray())
            S.push(c);
        while(!S.isEmpty())
            output+=S.pop();
        return s==output ? true: false;
    }
}
