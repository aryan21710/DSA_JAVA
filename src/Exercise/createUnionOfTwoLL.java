package Exercise;

import java.util.*;

public class createUnionOfTwoLL {
    public static void main(String[] args) {
        LinkedList<Integer>l1=new LinkedList<>();
        LinkedList<Integer>l2=new LinkedList<>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        unionOfTwoLL(l1,l2);
    }

    private static void unionOfTwoLL(LinkedList<Integer>l1, LinkedList<Integer>l2) {
        Set<Integer> s= new TreeSet<>();
        LinkedList<Integer>answer=new LinkedList<>();

        for (int i: l1)
            s.add(i);

        for (int i: l2)
            s.add(i);

        for (int i: s)
            answer.add(i);

        for(int i: answer)
            System.out.print(i+" ");

    }
}
