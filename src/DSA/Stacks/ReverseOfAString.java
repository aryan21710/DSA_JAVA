package DSA.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseOfAString {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        reverse(data, s);
    }

    static void reverse(String data, Stack<Character> s) {
        String output="";

        for (char c : data.toCharArray())
            s.push(c);

        int size = s.size();
        for (int i = 0; i < size; i++)
            output+=String.valueOf(s.pop());


        System.out.print(output);


    }
}
