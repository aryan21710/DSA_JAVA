package DSA.LinkedList;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data=data;
        this.next=null;
    }

    public Node() {
        this.data = -1;
        this.next=null;
    }
}

public class LLImplementation {
    public Node head;
    public static void main(String[] args) {
        LLImplementation myLL = new LLImplementation();
        myLL.insert(5);
        myLL.delete(5);

        myLL.insert(6);
        myLL.insert(7);
        myLL.insert(8);
        System.out.println("size:"+myLL.size());
        myLL.show();
        myLL.delete(6);
        myLL.show();
        System.out.println("size:"+myLL.size());
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head ==  null)
            head = newNode;
        else {
            Node traverse = head;
            while(traverse.next != null)
                traverse = traverse.next;
            traverse.next = newNode;
        }
    }

    public int size() {
        Node traverse = head;
        int llSize=1;
        while(traverse.next!=null) {
            llSize++;
            traverse=traverse.next;
        }
        return llSize;
    }

    public void delete(int data) {
        if (head ==  null)
            System.out.println("EMPTY LINKED LIST");
        else if (head.data==data) {
            Node newHead = head.next;
            head = newHead;
        }
        else {
            Node traverse = head;
            Node previous = new Node();
            while (traverse.data != data) {
                previous = traverse;
                traverse = traverse.next;
            }

            previous.next = traverse.next;
        }

    }

    public void show() {
        System.out.println("");
        if (head ==  null)
            System.out.println("EMPTY LINKED LIST");
        else {
            Node traverse = head;
            while(traverse.next!=null) {
                System.out.print(traverse.data+" ");
                traverse = traverse.next;

            }
            System.out.print(traverse.data);
        }
    }

    @Test
    public void testInsertion() {
        int insertCount=5;
        LLImplementation ll = new LLImplementation();
        while (insertCount > 0) {
            ll.insert(insertCount);
            insertCount--;
        }
        assertEquals(5,ll.size());
    }

    @Test
    public void testDeletion() {
        int insertCount=5;
        LLImplementation ll = new LLImplementation();
        while (insertCount > 0) {
            ll.insert(insertCount);
            insertCount--;
        }
        ll.delete(5);
        assertEquals(4,ll.size());
    }

}
