package Playground.Recursion;

import Playground.Recursion.Palindrome;

public class NumberPalindrome {
    static String mod="";
    public static void main(String[] args) {
        NumberPalindrome p = new NumberPalindrome();
        int num = 212;
//        System.out.println(iterativeIsPalindrome(num));
        recursiveIsPalindrome(num);
        String revMod="";
        System.out.println(mod.equals(Palindrome.reverse(mod, revMod)));

    }

    public static boolean iterativeIsPalindrome(int num) {
        String mod = "";
        String revMod = "";
        if (num < 10)
            return true;
        while (num > 0) {
            mod += (num % 10);
            num = num / 10;
        }
        System.out.println(mod);
        Palindrome palin = new Palindrome();
        return mod.equals(Palindrome.reverse(mod, revMod));
    }


    public static void recursiveIsPalindrome(int num) {
        if (num <= 0)
            return;
        mod += (num % 10);
        num /= 10;
        recursiveIsPalindrome(num);
    }
}
