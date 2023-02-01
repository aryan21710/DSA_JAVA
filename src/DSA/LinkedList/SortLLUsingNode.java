package DSA.LinkedList;
import java.util.Scanner;

public class SortLLUsingNode {
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        LinkedList li = new LinkedList();

        for(int i = 0; i < n; i++)
        {
            int a;
            a = s.nextInt();
            li.push(a);
        }
        li.sortList();
        li.printList();
    }
}



class LinkedList
{
    Node head;
    int countZero=0,countOne=0, countTwo=0;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node() {next=null;}
    }

    void updateCount(Node temp) {
        if (temp.data==0)
            this.countZero++;
        else if(temp.data==1)
            this.countOne++;
        else
            this.countTwo++;
    }


    void sortList()
    {
        //Write code here
        Node temp = head;
        while(temp.next!=null) {
            updateCount(temp);
            temp=temp.next;
        }
        updateCount(temp);

        temp = head;
        int count=countZero+countOne+countTwo;

        for (int i = 0; i < count; i++) {
            if (i < countZero) {
                temp.data = 0;
            } else if (i >= countZero && i < countZero+countOne) {
                temp.data = 1;
            } else {
                temp.data = 2;
            }
            temp = temp.next;
        }
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


