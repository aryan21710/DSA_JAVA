package DSA.LinkedList;

// https://learn.upgrad.com/course/3008/segment/28401/170164/520796/2673161

import java.util.LinkedList;
import java.util.Scanner;

public class SortLLusingLL {
    static int countZero=0,countOne=0, countTwo=0;
    static LinkedList<Integer> sortedList = new LinkedList<>();
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        for(int i = 0; i < n; i++)
        {
            int a;
            a = s.nextInt();
            li.push(a);
        }

        sortLinkedList(li);
        showLL();
    }

    static void updateCount(LinkedList<Integer> li) {
        for (Integer i: li) {
            if (i==0)
                countZero++;
            else if(i==1)
                countOne++;
            else
                countTwo++;
        }
    }

    static LinkedList<Integer> createLL(int count, int type) {
        LinkedList<Integer> updatedLL = new LinkedList<>();
        while(count > 0) {
            updatedLL.add(type);
            count--;
        }
        return updatedLL;
    }

    static void showLL() {
        for (Integer i: sortedList) {
            System.out.print(i+" ");
        }
    }

    static void sortLinkedList(LinkedList<Integer> li) {
        updateCount(li);
        sortedList= createLL(countZero, 0);
        LinkedList<Integer> oneLL= createLL(countOne, 1);
        LinkedList<Integer> twoLL= createLL(countTwo, 2);
        for (Integer i: oneLL)
            sortedList.add(i);
        for (Integer i: twoLL)
            sortedList.add(i);
    }
}
