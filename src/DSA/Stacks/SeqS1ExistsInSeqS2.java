package DSA.Stacks;
import java.util.Scanner;
import java.util.Stack;

public class SeqS1ExistsInSeqS2 {
    public static void main(String[] args) {
        String line1 = "1 2 3";
        String line2 = "11 12 1 22 2 33 3 4";
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
    }

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student
        while(true) {
            if (sequence1.isEmpty()) return true;
            if (!sequence1.isEmpty() && sequence2.isEmpty()) return false;
            int elem1=sequence1.pop();
            int elem2=sequence2.pop();
            if (elem1 != elem2) {
              while (elem1 != elem2)  {
                  if (!sequence2.isEmpty()) {
                      elem2=sequence2.pop();
                  } else {
                     return false;
                  }
              }
            }
        }
    }

}
