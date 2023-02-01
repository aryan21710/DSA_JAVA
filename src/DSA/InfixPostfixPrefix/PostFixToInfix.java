package DSA.InfixPostfixPrefix;
import java.util.*;

public class PostFixToInfix {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        System.out.println(postToInfix(exp,s));

    }

    static int performOperation(int operand1, int operand2, char operator) {
        if (operator=='*')
            return operand1*operand2;
        if (operator=='+')
            return operand1+operand2;
        if (operator=='-')
            return operand1-operand2;
        if (operator=='/')
            return operand1/operand2;
        return -1;
    }

    static Integer postToInfix(String exp, Stack<Integer> s) {
        int answer=0;
        for (Character c: exp.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                s.push(Integer.valueOf(c.toString()));
            else {
                if(!s.isEmpty())
                    answer=performOperation(s.pop(),s.pop(),c);
                s.push(answer);
                }
            }
        return answer;
        }

    }

