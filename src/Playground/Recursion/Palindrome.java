package Playground.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palin = new Palindrome();
        String s="abba";
        String rev="";
        System.out.println(reverse1(s,s.length()-1));
        System.out.println("Is palindrome:-"+s.equals(reverse1(s,s.length()-1)));
    }

    public static String reverse(String s, String rev) {
        if (s.length()==0)
            return null;
        if (s.length()==1) {
            rev+=s.charAt(0);
        } else {
            int index = s.length()-1;
            String s1 = s.substring(0,index);
            rev+=s.charAt(index)+ reverse(s1,rev);
        }
        return rev;
    }

   // better palindrome version
    public static String reverse1(String s, int length) {
        if (length < 0) return "";
        return s.charAt(length)+reverse1(s,length-1);
    }

}
