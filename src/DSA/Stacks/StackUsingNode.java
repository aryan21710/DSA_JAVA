package DSA.Stacks;

import java.util.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next=null;
    }

}



public class StackUsingNode {
    LinkedList<Integer> list= new LinkedList<>();
    static Node head;
    public static void main(String[] args) {
        StackUsingNode myStack=new StackUsingNode();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.show();
        int popped=myStack.pop();
        System.out.println("\npopped "+popped);
        popped=myStack.pop();
        System.out.println("popped "+popped);
        myStack.show();
    }

    public static void push(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            Node traverse= head;
            while(traverse.next!=null)
                traverse=traverse.next;
            traverse.next=newNode;
        }
    }

    public static void show() {
        if (head==null)
            System.out.println("EMPTY STACK");
        else {
            Node traverse=head;
            while(traverse.next!=null) {
                System.out.print(traverse.data+" ");
                traverse=traverse.next;
            }
            System.out.print(traverse.data);
        }


    }

    public static int pop() {
        if (!isEmpty()) {
            Node topNode= head;
            Node penultimateNode = null;
            while(topNode.next!=null) {
                penultimateNode=topNode;
                topNode=topNode.next;
            }
            penultimateNode.next=null;
            return topNode.data;
        }
        return -1;
    }

    public static boolean isEmpty() {
        return head==null;
    }



}
