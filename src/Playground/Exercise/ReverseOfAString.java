package Playground.Exercise;

public class ReverseOfAString {
    public static void main(String[] args) {
        String str ="Welcome to Upgrad";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        String[] list = str.split(" ");
        String reverse="";
        for (int i = 0; i < list.length; i++) {
            for(int j = list[i].length()-1; j>=0; j--) {
                reverse+=list[i].charAt(j);
            }
            if (i < list.length-1)
                reverse+=" ";
        }
        System.out.println(reverse.length());
        return reverse;
    }
}
