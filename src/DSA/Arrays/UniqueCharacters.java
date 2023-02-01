package DSA.Arrays;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] c = s.toCharArray();
        String nonUnique="";
        for (int i = 0; i < c.length; i++) {
            for (int j = i+1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    nonUnique+=c[i];
                    break;
                }
                String temp = Character.toString(c[i]);
                if (j==c.length-1 && !nonUnique.contains(temp)) {
                    System.out.println("unique character "+c[i]);
                    return;
                }
            }
        }
    }
}
