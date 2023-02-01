package DSA.Queue.Exercise;

import java.util.LinkedList;
import java.util.Queue;

class Palidrome {
    static Queue<Character> queue = new LinkedList<Character>();

    public static void main(String[] args) {
        ifPalindrome1("dad");
    }

    static void ifPalindrome(String s) {
        String output = "";
        for (char c: s.toCharArray()) {
            if (queue.isEmpty()) {
                queue.add(c);
            } else {
                queue.add(c);
                int iterator = queue.size()-1;
                while(iterator > 0) {
                    queue.add(queue.remove());
                    iterator--;
                }
            }
        }
        while(!queue.isEmpty())
            output+=queue.remove();

        if (s==output) {
            System.out.println("The given input is a palindrome.");
        } else {
            System.out.println("The given input is not a palindrome.");
        }
    }


    static void ifPalindrome1(String s) {
        int size = s.length();
        String result="";
        char[] output = new char[size];
        for (char c: s.toCharArray()) {
            queue.add(c);
        }

        while(!queue.isEmpty()) {
            output[size-1]=queue.remove();
            size--;
        }

        for (int i = 0; i < output.length; i++) {
            result+=output[i];
        }

        if (s==result) {
            System.out.println("The given input is a palindrome.");
        } else {
            System.out.println("The given input is not a palindrome.");
        }

    }
}

