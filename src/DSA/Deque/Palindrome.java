package DSA.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        String str = "aabb";
        Deque<Character> deq = new LinkedList<>();
        for (char s: str.toCharArray())
            deq.add(s);
        System.out.println(checkIfPalindrome(deq));
    }

    private static boolean checkIfPalindrome(Deque<Character> deq) {
        int size = deq.size();
        int median = -1;
        if (size%2==0) {
            median = (int)(Math.ceil((float)deq.size()/2))+1;
        } else {
            median = (int)(Math.ceil((float)deq.size()/2));
        }
        for (int i = 0; i < median; i++) {
            if (deq.size()<=1)
                return true;
            if (deq.removeFirst()!=deq.removeLast())
                    return false;
        }
        return false;
    }
}
