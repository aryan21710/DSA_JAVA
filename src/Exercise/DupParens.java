package Exercise;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class DupParens<T> {
    public static void main(String[] args) {
        String input = "(n(a+b)+c)";
        boolean status=checkForDuplicateParenthesis(input);
        if (status) {
            System.out.println("DUPLICATE PARENTHESIS");
        } else {
            System.out.println("NON DUPLICATE PARENTHESIS");
        }

    }

    static boolean checkForDuplicateParenthesis(String input) {
        int count=0;
        for (int i = 0; i < input.toCharArray().length-1; i++) {
            if (input.toCharArray()[i+1]=='(' && input.toCharArray()[i]=='(')
                count++;
            if (input.toCharArray()[i+1]==')' && input.toCharArray()[i]==')')
                count++;
        }

        return count>=2? true: false;

    }

    @Test
    static void testDupParens() {
        String[] truthy = {"((n(a+b)))","((a+b)),(n+((a+b))d"};
        String[] falsy = {"(n(a+b)+c),(a)"};
        for (String s: truthy) {
            boolean output = checkForDuplicateParenthesis(s);
            assertTrue(output);
        }

        for (String s: falsy) {
            boolean output = checkForDuplicateParenthesis(s);
            assertFalse(output);
        }

    }

}
