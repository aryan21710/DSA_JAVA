package Exercise;

import org.testng.annotations.Test;

import java.util.Scanner;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class MatchingParenthesis {
    public static void main(String[] args) {
        String input="()()";
        System.out.println(match(input));
    }

    static boolean match(String input) {
        int count = 0;
        if (input.charAt(0)==')')
            return false;
        for (char c: input.toCharArray()) {
            if (c=='(') {
                count++;
            } else if (c==')') {
                count--;
            }
        }

        return count == 0 ? true : false;
    }

    @Test
    static void testMatchingParens() {
        String[] truthy={"()(),(()),(),(()())"};
        String[] falsy={"()(,((),)(,(()()"};
        for (String s: truthy) {
            boolean output = match(s);
            assertTrue(output);
        }

        for (String s: falsy) {
            boolean output = match(s);
            assertFalse(output);
        }
    }
}
