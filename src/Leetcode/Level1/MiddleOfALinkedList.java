package Leetcode.Level1;

public class MiddleOfALinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        middleNode(head);

    }
    public static ListNode middleNode(ListNode head) {
        if (head==null)
            return null;
        ListNode traverse = head;
        int size = 0;
        while (traverse.next != null) {
            traverse = traverse.next;
            size++;
        }
        size++;
        int iter=0;
        traverse = head;
        while (iter < (size/2)) {
            traverse = traverse.next;
            iter++;
        }
        return traverse;
    }
}
