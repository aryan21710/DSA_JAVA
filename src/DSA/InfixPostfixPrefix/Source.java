package DSA.InfixPostfixPrefix;

// https://learn.upgrad.com/course/3008/segment/28401/171462/524866/2694254
// https://www.codingninjas.com/codestudio/library/infix-postfix-and-prefix-conversion

import org.testng.annotations.Test;

import java.util.Stack;

import static org.testng.AssertJUnit.assertEquals;

public class Source {
    static Stack<Character> S = new Stack<>();
    public static void main(String[] args) {
        String expr="b+(c*d)+e+a";
        System.out.println(infixToPostfix(expr));
    }

    static int checkPrecedence(char ch) {
        if(ch == '^')
            return 3;
        else if(ch == '/' || ch =='*')
            return 2;
        else if(ch == '+' || ch == '-')
            return 1;
        else
            return -1;
    }


    static String infixToPostfix(String expr) {
        String answer="";
        for (char c: expr.toCharArray()) {
            if (c=='(')
                S.push(c);
            else if (c==')') {
                while (!S.isEmpty() && S.peek()!='(') {
                    answer+=S.pop();
                }
                S.pop();
            } else if (c>='a' && c<='z' || c>='A' && c<='B')
                answer+=c;
            else {
                while (!S.isEmpty() && checkPrecedence(c) <= checkPrecedence(S.peek())) {
                        answer+=S.pop();
                    }
                S.push(c);
            }
        }

        while (!S.isEmpty()) {
            answer+=S.pop();
        }

        return answer;
    }


    @Test
     static void checkInfixToPostfix() {
        String[] input = {"a*b-(c+d)+e","a^b","a*(b+c)"};
        String[] expectedOutput={"ab*cd+-e+","ab^","abc+*"};
        for (int i = 0; i < input.length; i++) {
            assertEquals(infixToPostfix(input[i]),expectedOutput[i]);
        }
    }
}
